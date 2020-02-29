import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeGameTest {
    boolean[][] testBoard1 = {{true, true},
            {false, false}};
    boolean[][] testBoard2 = {{false, true, true, true},
            {false, false, false, true},
            {false, false, false, true},
            {false, false, false, true}};
    boolean[][] testBoard3 = {{false, false},
            {false, false}};
    boolean[][] testBoard4 = {{false, true, true, true},
            {false, true, false, true},
            {false, true, false, true},
            {false, true, true, true}};
    boolean[][] testBoard5 = {{false, true, true, true},
            {false, false, false, true},
            {true, false, false, true},
            {true, true, true, false}};

    @Test
    public void findTailExhaustive1() {//Testing length and tail position with a 2x2 array
        int[] result = {0, 0, 2};
        SnakeGame sol = new SnakeGame(testBoard1, 0, 1);
        assertArrayEquals(result, sol.findTailExhaustive());
    }

    @Test
    public void findTailExhaustive2() {//Testing length and tail position with a 4x4 array and longer snake
        int[] result = {3, 3, 6};
        SnakeGame sol = new SnakeGame(testBoard2, 0, 1);
        assertArrayEquals(result, sol.findTailExhaustive());
    }

    @Test
    public void findTailExhaustive3() {//Testing length and tail position with an array with no trues
        int[] result = {0, 0, 0};
        SnakeGame sol = new SnakeGame(testBoard3, 0, 0);
        assertArrayEquals(result, sol.findTailExhaustive());
    }

    @Test
    public void findTailExhaustive4() {//Testing length and tail position with a snake with no tail
        int[] result = {0, 1, 10};
        SnakeGame sol = new SnakeGame(testBoard4, 0, 1);
        assertArrayEquals(result, sol.findTailExhaustive());
    }
    @Test
    public void findTailExhaustive5() {//Testing a broken snake expect fail
        int[] result = {0, 3, 10};
        SnakeGame sol = new SnakeGame(testBoard5, 0, 1);
        assertArrayEquals(result, sol.findTailExhaustive());
    }
    //Recursive Checks

    @Test
    public void findTailRecursive1() {//Testing length and tail position with a 2x2 array
        int[] result = {0, 0, 2};
        SnakeGame sol = new SnakeGame(testBoard1, 0, 1);
        assertArrayEquals(result, sol.findTailExhaustive());
    }

    @Test
    public void findTailRecursive2() {//Testing length and tail position with a 4x4 array and longer snake
        int[] result = {3, 3, 6};
        SnakeGame sol = new SnakeGame(testBoard2, 0, 1);
        assertArrayEquals(result, sol.findTailRecursive());
    }

    @Test
    public void findTailRecursive3() {//Testing length and tail position with an array with no trues
        int[] result = {0, 0, 0};
        SnakeGame sol = new SnakeGame(testBoard3, 0, 0);
        assertArrayEquals(result, sol.findTailRecursive());
    }

    @Test
    public void findTailRecursive4() {//Testing length and tail position with a snake with no tail
        int[] result = {0, 1, 10};
        SnakeGame sol = new SnakeGame(testBoard4, 0, 1);
        assertArrayEquals(result, sol.findTailRecursive());
    }
    @Test
    public void findTailRecursive5() {//Testing a broken snake expect fail
        int[] result = {0, 3, 10};
        SnakeGame sol = new SnakeGame(testBoard5, 0, 1);
        assertArrayEquals(result, sol.findTailRecursive());
    }


}
