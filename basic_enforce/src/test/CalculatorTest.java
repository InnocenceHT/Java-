package test;

/*
    Junit使用：白盒测试
        *步骤：
            1.定义一个测试类（测试用例）
                *建议：
                    *测试类名：被测试的类名Test   CalculatorTest
                    *包名：xxx.xxx.xx.test
            2.定义测试方法：可以独立运行
                *建议
                    *方法名：test测试的方法名
                    *返回值：void
                    *参数列表：空参
            3.给方法加@Test
            4.导入Junit依赖环境
        *判定结果
            *红色：失败
            *绿色：成功
            *一般我们会使用断言操作来处理结果
                Assert.assertEquals(期望的结果,程序的结果)

        *补充：
            *@Before:
                * 修饰方法会在测试方法之前被自动执行
            *@After:
                * 修饰的方法会在测试方法执行之后自动被执行

 */
public class CalculatorTest {
    /*
        初始化方法
        用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
//    @Before
    public void init() {
        System.out.println();
    }

    /*
        释放资源方法：
        在所有测试方法执行完后，都会自动执行该方法
     */
    public void close() {

    }



    /*
        测试add方法
     */
    public void testAdd() {

    }
}
