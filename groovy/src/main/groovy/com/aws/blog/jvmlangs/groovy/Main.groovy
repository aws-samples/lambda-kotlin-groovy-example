package com.aws.blog.jvmlangs.groovy

class HandlerInput {
    String who
}
class HandlerOutput {
    String message
}

class Main {
    def handler(HandlerInput input) {
        return new HandlerOutput(message: "Hello ${input.who}")
    }
}
