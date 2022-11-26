package Util;

/**
 * Simple 2D position encapsulation
 */
public class Position2D<T>//Use T to either implement with int,float,double etc. later on
{
    public T x;
    public T y;

    public Position2D(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
}
