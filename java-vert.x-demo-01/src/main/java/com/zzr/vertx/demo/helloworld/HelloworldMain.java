package com.zzr.vertx.demo.helloworld;

import com.zzr.vertx.demo.helloworld.verticle.MyFirstVericle;
import io.vertx.core.Vertx;

public class HelloworldMain {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(MyFirstVericle.class.getName());
    }
}
