fun main(args: Array<String>) {
    var difs : MutableList<Long>
    difs = mutableListOf()
    while(true) {
        val aux = readLine()
        aux?: break
        var points = 0
        var (n, g) = aux.split(' ').map(String::toLong)
        difs.clear()
        for (i in 1..n){
            val (a, b) = readLine()!!.split(' ').map(String::toLong)
            if (a>b){
                points += 3
            }
            else{
                difs.add((a - b) * -1)
            }
        }
        difs.sort()
        while (difs.size > 0){
            if(difs[0] - g < 0){
                points += 3
                g -= (difs[0] + 1)
                difs.removeAt(0)
            }
            else{
                if (difs[0] - g == 0.toLong()){
                    points += 1
                    g -= (difs[0])
                    difs.removeAt(0)
                }
                else{
                    break
                }
            }
        }
        println(points)



    }
}
