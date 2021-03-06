package org.baeldung.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.baeldung.web.dto.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping(value = "/foo")
public class FooController {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public FooController() {
        super();
    }

    // API

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Foo findOne(@PathVariable("id") final Long id, final UriComponentsBuilder uriBuilder, final HttpServletResponse response) {
        return new Foo();
    }

}
