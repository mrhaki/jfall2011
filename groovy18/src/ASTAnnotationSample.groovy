import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includeFields=true)
class Person {
    String name
    int age
    private boolean active = false
}

def p = new Person('mrhaki', 38)
println p.toString()
