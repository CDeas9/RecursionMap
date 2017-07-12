/**
 * Write a description of class path here.
 * 
 * @author Callie Deas
 * @version 3-13-2017
 */
public class path
{
    /**
     * Counts the number of paths between the origin and a second point made by moving 
     * south and east.
     * 
     * @param  numsouth the amount of units south
     * @param  numEast the amount of units 
     * @return    the number of paths between the two points
     */
    public static int numPaths(int numSouth, int numEast)
    {

        if(numEast == 0 || numSouth == 0) return 1;
        return numPaths(numSouth-1, numEast) + numPaths(numSouth, numEast -1);
    }
}