package com.github.dmireles00.bug.services

import com.intellij.openapi.project.Project
import com.github.dmireles00.bug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
