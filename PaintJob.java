
public class PaintJob {

	public static void main(String[] args) {
		getBucketCount(3.4, 1.5);
	}
	
	 public static int getBucketCount (double width , double height , double areaPerBucket , int extraBuckets){
	        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <0) return -1;
	        return getBucketCount(width , height ,areaPerBucket) - extraBuckets;
	        
	    }
	    
	    public static int getBucketCount (double width , double height , double areaPerBucket){
	         if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
	         int numberOfBuckets = 0;
	         double areaOfWall = height * width;
	         double minBucketsNeeded = areaOfWall / areaPerBucket;
	         return (int)(minBucketsNeeded) + 1;
	    }
	    
	    public static int getBucketCount(double area , double areaPerBucket){
	        if(area <= 0 || areaPerBucket <= 0) return -1;
	        return (int)(area / areaPerBucket) +1;
	    }
	
}
