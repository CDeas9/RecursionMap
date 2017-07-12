
/**
 * Counts the number of paths between two points.
 * 
 * @author Callie Deas 
 * @version 3-18-2017
 */
public class Test
{
    //Question 2
    public static int numPaths2(int point1x, int point1y, int point2x, int point2y)
    {
        if((point1x == point2x) || (point1y == point2y)) return 1;
        return numPaths2(point1x, point1y, point2x-1, point2y) + 
        numPaths2(point1x, point1y, point2x, point2y-1);

    }
}
