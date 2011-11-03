def incrementChange = false
def increment = {
   incrementChange = true
   it + 1
}

def incrementMemoize = increment.memoize()
def result = incrementMemoize(2)
println result
println incrementChange
incrementChange = false

result = incrementMemoize(2)
println result
println incrementChange


























