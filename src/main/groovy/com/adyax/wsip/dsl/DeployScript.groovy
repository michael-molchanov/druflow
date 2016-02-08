package com.adyax.wsip.dsl

/**
 * Created by alex on 03.08.15.
 */
abstract class DeployScript extends Script {

    def stage(stage, closure = null) {
        this.binding.controller.stage(stage, closure)
    }

    def env(env, closure = null) {
        this.binding.controller.env(env, closure)
    }

    def drush(LinkedHashMap params, String cmd) {
        this.binding.controller.drush(params, cmd)
    }
}
