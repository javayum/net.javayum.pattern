package net.javayum.pattern.app.war;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Application extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{ApplicationConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{ServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/javayum/*"};
    }
}

