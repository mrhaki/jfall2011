import groovyx.gpars.GParsPool

def range = 0..10000

def list = range.collect { it * 2 }.findAll { it % 2 == 0 && it % 7 == 0 }

println list

GParsPool.withPool {
    def list2 = range.collectParallel { it * 2 }.findAllParallel { it % 2 == 0 && it % 7 == 0 }
    println list2
}