package Seminar_5;

public class Task {
    public static void main(String[] args) {
        var mg = new MapGenerator();
        System.out.println(
            new MapPrinter().rawData(
                mg.getMap()));
    }
}

class MapGenerator {
    int[][] field;

    public MapGenerator() {
        int[][] field = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, -1, -1, 00, 00, -1, -1, -1, -1, 00, -1, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, -1, -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, -1, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, 02, -1 },
            { -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, -1, -1, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, -1 },
            { -1, 00, -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, 00, 00, -1 },
            { -1, 01, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };
    this.field = field;
    }

    public int[][] getField() {
        return field;
    }
    public int[][] getMap() {
        return field;
      }
    

}
class MapPrinter {

    public MapPrinter() {
    }
  
    public String rawData(int[][] map) {
      StringBuilder sb = new StringBuilder();
  
      for (int row = 0; row < map.length; row++) {
        for (int col = 0; col < map[row].length; col++) {
          sb.append(String.format("%5d", map[row][col]));
        }
        sb.append("\n");
      }
      for (int i = 0; i < 3; i++) {
        sb.append("\n");
      }
  
      return sb.toString();
    }
}

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
    
