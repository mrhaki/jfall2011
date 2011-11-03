def list = ['Simple', 'list', 'with', 5, 'items']
println list.take(2)
println list.drop(1)

def languages = ['Groovy', 'Grails', 'Java']
println languages.count { it.startsWith('G') }
println languages.countBy { it[0] } == ['G': 2, 'J': 1]  // 2 items start with G, 1 with J.

def numbers = [1,2,3,4] as Integer[]
println numbers.count { it > 3 }
println numbers.countBy { it % 2 } == [0: 2, 1: 3]  // 2 even, 3 uneven numbers

def map = [user: 'mrhaki', city: 'Tilburg', age: 37]
println map.count { key, value -> key.size() == 3 }
println map.countBy { key, value -> value.class } == [(String.class): 2, (Integer.class): 1]  // 2 values of type String and 1 of type Integer
