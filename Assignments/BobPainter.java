package Assignments;



public class BobPainter {
    public static int getBucketCount(double width, double height, double areaPerbucket,int noOfBucketsAtHome)  {
        if(width <= 0 || height <=0 || areaPerbucket<=0 || noOfBucketsAtHome <0){
            return -1;
        }
        return ((int)((width * height)/areaPerbucket) - noOfBucketsAtHome);

    }
    public static int getBucketCount(double width, double height, double areaPerbucket)  {
        if(width <= 0 || height <=0 || areaPerbucket<=0 ){
            return -1;
        }
        return ((int)((width * height)/areaPerbucket));

    }
    public static int getBucketCount(double area, double areaPerbucket)  {
        if(area <=0 || areaPerbucket<=0 ){
            return -1;
        }
        return (int)(area/areaPerbucket);

    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(100, 100, 200, 2));
        System.out.println(getBucketCount(0, 100, 200, 2));
        System.out.println(getBucketCount(20, 25, 10));
    }

    
}
