fun main ()
{
    val word="NEPAL"
    for( i in 1..5)
    {
        for( j in 0 .. i-1)
        {
            print(word[j])
        }
        println()
    }
}