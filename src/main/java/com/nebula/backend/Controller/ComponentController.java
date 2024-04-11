package com.nebula.backend.Controller;

import com.nebula.backend.Document.Component;
import com.nebula.backend.Model.Response;
import com.nebula.backend.Service.ComponentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/component")
@AllArgsConstructor
public class ComponentController {

    private final ComponentService componentService;

    @GetMapping("/all")
    public ResponseEntity<Response> getAllComponents() {
        return ResponseEntity.ok(Response.builder()
                .timestamp(java.time.LocalDateTime.now())
                .statusCode(200)
                .status(OK)
                .message("Components fetched successfully")
                .data(java.util.Map.of("components", componentService.getAllComponents()))
                .build());
    }

    @GetMapping(path = "{componentId}")
    public ResponseEntity<Response> getComponentById(@PathVariable("componentId") String componentId) {
        return ResponseEntity.ok(Response.builder()
                .timestamp(java.time.LocalDateTime.now())
                .statusCode(200)
                .status(OK)
                .message("Component fetched successfully")
                .data(java.util.Map.of("component", componentService.getComponentById(componentId)))
                .build());
    }

    @PostMapping
    public ResponseEntity<Response> addNewComponent(@RequestBody Component component) {
        componentService.addNewComponent(component);
        return ResponseEntity.ok(Response.builder()
                .timestamp(java.time.LocalDateTime.now())
                .statusCode(200)
                .status(CREATED)
                .message("Component added successfully")
                .data(java.util.Map.of("component", component))
                .build());
    }

    @DeleteMapping(path = "{componentId}")
    public ResponseEntity<Response> deleteComponentById(@PathVariable("componentId") String componentId) {
        componentService.deleteComponentById(componentId);
        return ResponseEntity.ok(Response.builder()
                .timestamp(java.time.LocalDateTime.now())
                .statusCode(200)
                .status(OK)
                .message("Component deleted successfully")
                .data(java.util.Map.of("componentId", componentId))
                .build());
    }

    @PutMapping(path = "{componentId}")
    public ResponseEntity<Response> updateComponentById(@PathVariable("componentId") String componentId,
                                                        @RequestBody Component component) {
        componentService.updateComponentById(componentId, component);
        return ResponseEntity.ok(Response.builder()
                .timestamp(java.time.LocalDateTime.now())
                .statusCode(200)
                .status(OK)
                .message("Component updated successfully")
                .data(java.util.Map.of("component", componentService.getComponentById(componentId)))
                .build());
    }

}