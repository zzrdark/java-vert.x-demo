package com.zzr.vertx.demo.helloworld.verticle;

import io.vertx.core.AbstractVerticle;

public class MyFirstVericle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
            req.response().putHeader("content-type","text/plain")
                    .end("HelloWorld!");
        }).listen(8080);
    }
}
