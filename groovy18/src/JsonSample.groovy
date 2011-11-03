
































import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def builder = new JsonBuilder()
builder.message {
    header {
        from 'mrhaki'
        to 'nljugmembers', 'jfallattendees'
    }
    text 'Simple message content'
}

def message = builder.toString()
println message
println JsonOutput.prettyPrint(builder.toString())

def parser = new JsonSlurper()
def jsonMessage = parser.parseText(message)

println jsonMessage.message.header.from
println jsonMessage.message.header.to
