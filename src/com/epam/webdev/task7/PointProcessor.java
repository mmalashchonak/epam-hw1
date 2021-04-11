package com.epam.webdev.task7;

public class PointProcessor {

    public static Point returnPointCloserToOrigin(Point firstPoint, Point secondPoint) throws SameDistanceException {
        if(firstPoint == null || secondPoint == null) {
            // throw new InputNullPoint Exception;
        }

        if(firstPoint.compareTo(secondPoint) > 0){
            return secondPoint;
        } else if(firstPoint.compareTo(secondPoint) < 0) {
            return firstPoint;
        } else {
            throw new SameDistanceException("Input Points are on the same distance to Origin.");
        }
    }
}
