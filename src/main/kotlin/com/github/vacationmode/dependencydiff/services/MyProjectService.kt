package com.github.vacationmode.dependencydiff.services

import com.github.vacationmode.dependencydiff.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
