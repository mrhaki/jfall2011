import static Task.*
import static Location.*

// Constants for tasks and clients.
enum Task { design, testing, developing }
enum Location { GroovyRoom, OfficeSpace }

// Supporting class to save work item info.
class WorkItem {
    Task task
    Location location
    Integer hours

    String toString() {
        "task $task took $hours hours"
    }
}

Integer.metaClass.getHours = { -> delegate }
Integer.metaClass.getHour = { -> delegate }

workList = []

def worked(Integer hours) {
    ['on': { Task task ->
        ['at': { Location location ->
            workList << new WorkItem(task: task, location:location, hours: hours)
        }]
    }]
}

def developed(Integer hours) {
    ['at': { Location location ->
        workList << new WorkItem(task: developing, location: location, hours: hours)
    }]
}



// -----------------------------------
// DSL
// -----------------------------------
worked 2.hours on design at GroovyRoom
developed 3.hours at OfficeSpace
developed 1.hour at GroovyRoom
worked 4.hours on testing at GroovyRoom

println workList.sum { it.hours }

















//import groovy.transform.ToString
//import static Task.developing
//
//workList = []
//
//Integer.metaClass.getHours = { -> delegate }
//Integer.metaClass.getHour = { -> delegate }
//
//def worked(Integer hours) {
//    ['on': { Task task ->
//        ['at': { Client client ->
//            workList << new WorkItem(task: task, client: client, hours: hours)
//        }]
//    }]
//}
//
//def developed(Integer hours) {
//    ['at': { Client client ->
//        workList << new WorkItem(task: developing, client: client, hours: hours)
//    }]
//}
//
//// Constants for tasks and clients.
//enum Task { design, testing, developing }
//enum Client { GroovyRoom, OfficeSpace }
//
//// Supporting class to save work item info.
//@ToString
//class WorkItem {
//    Task task
//    Client client
//    Integer hours
//}
//
//
//println workList.sum { it.hours }