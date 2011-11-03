def languages = ['Groovy', 'Scala', 'Clojure']

def convert = { new Expando(language: it) }
def upper = { it.toUpperCase() }
def lastLetter = { it[-1] }

def composite = convert << upper

println languages.collect(composite)

def c2 = upper << lastLetter

println languages.collect(c2).join()
