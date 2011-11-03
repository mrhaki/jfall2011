import groovy.transform.Canonical
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer

def conf = new CompilerConfiguration()
conf.addCompilationCustomizers(new ASTTransformationCustomizer(Canonical))

def shell = new GroovyShell(conf)
shell.evaluate '''
class User {
   String username, fullname
}

def user = new User('mrhaki', 'Hubert A. Klein Ikkink')

println user.toString()

println this
'''


























