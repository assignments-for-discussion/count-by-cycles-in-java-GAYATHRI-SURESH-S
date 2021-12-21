package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(i=0;i<nBatteries;i++)
  {
    if(cycles[i]<150)  //if charged<150 then lowCunt
      counts.lowCount++;
    else if((150<=cycles[i]) && (cycles[i]<649))  //if  < charged < 649 then mediumCount
      counts.mediumCount++;
    else if(cycles[i] >=650)
      counts.highCount++; 
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 1);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 2);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
