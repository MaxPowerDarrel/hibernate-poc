package com.example.hibernatepoc.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/widgets")
public class WidgetResource {
    private final WidgetRepository widgetRepository;
    private final WidgetContainerRepository widgetContainerRepository;

    public WidgetResource(WidgetRepository widgetRepository, WidgetContainerRepository widgetContainerRepository) {
        this.widgetRepository = widgetRepository;
        this.widgetContainerRepository = widgetContainerRepository;
    }

    @GetMapping
    public Iterable<Widget> getAllWidgets() {
        return widgetRepository.findAll();
    }

    @GetMapping("/containers")
    public Iterable<WidgetContainer> getAllContainers() {
        return widgetContainerRepository.findAll();
    }
}
