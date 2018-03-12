package com.nfplus.testgroovy

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {

    void apply(Project project) {
        project.task('test1Task') << {
            System.out.println("========================");
            println "hello gradle plugin xl"
            System.out.println("hello gradle plugin!");
            System.out.println("========================");
        }
    }
}
