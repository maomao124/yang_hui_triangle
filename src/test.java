import java.util.Scanner;

/**
 * Project name(项目名称)：输出杨辉三角形 yang_hui_triangle
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/27
 * Time(创建时间)： 20:21
 * Version(版本): 1.0
 * Description(描述)： （使用二维数组）
 */

public class test
{
    public static void main(String[] args)
    {
        // 从控制台获取行数
        Scanner sc = new Scanner(System.in);
        System.out.print("打印杨辉三角形的行数：");
        int row = sc.nextInt();
        // 根据行数定义好二维数组，由于每一行的元素个数不同，所以不定义每一行的个数
        int[][] arr = new int[row][];
        // 遍历二维数组
        for (int i = 0; i < row; i++)
        {
            // 初始化每一行的这个一维数组
            arr[i] = new int[i + 1];
            for (int j = 1; j <= row - i; j++)
            {
                System.out.print(" ");
            }
            // 遍历这个一维数组，添加元素
            for (int j = 0; j <= i; j++)
            {
                // 每一列的开头和结尾元素为1，开头的时候，j=0，结尾的时候，j=i
                if (j == 0 || j == i)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    // 每一个元素是它上一行的元素和斜对角元素之和
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
