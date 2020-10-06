package org.gxuwz.arithmatic.lanqiao.lanqiao11_模拟2;

/**
 * @description:
 *
 * 【问题描述】
 * 2015年，全中国实现了户户通电。作为一名电力建设者，小明正在帮助一带一路上的国家通电。
 * 这一次，小明要帮助 n 个村庄通电，其中 1 号村庄正好可以建立一个发电站，所发的电足够所有村庄使用。
 * 现在，这 n 个村庄之间都没有电线相连，小明主要要做的是架设电线连接这些村庄，使得所有村庄都直接或间接的与发电站相通。
 * 小明测量了所有村庄的位置（坐标）和高度，如果要连接两个村庄，小明需要花费两个村庄之间的坐标距离加上高度差的平方，
 * 形式化描述为坐标为 (x_1, y_1) 高度为 h_1 的村庄与坐标为 (x_2, y_2) 高度为 h_2 的村庄之间连接的费用为
 * sqrt((x_1-x_2)*(x_1-x_2)+(y_1-y_2)*(y_1-y_2))+(h_1-h_2)*(h_1-h_2)。
 * 在上式中 sqrt 表示取括号内的平方根。请注意括号的位置，高度的计算方式与横纵坐标的计算方式不同。
 * 由于经费有限，请帮助小明计算他至少要花费多少费用才能使这 n 个村庄都通电。
 * 【输入格式】
 * 输入的第一行包含一个整数 n ，表示村庄的数量。
 * 接下来 n 行，每个三个整数 x, y, h，分别表示一个村庄的横、纵坐标和高度，其中第一个村庄可以建立发电站。
 * 【输出格式】
 * 输出一行，包含一个实数，四舍五入保留 2 位小数，表示答案。
 * 【样例输入】
 * 4
 * 1 1 3
 * 9 9 7
 * 8 8 6
 * 4 5 4
 * 【样例输出】
 * 17.41
 * 【评测用例规模与约定】
 * 对于 30% 的评测用例，1 &lt;= n &lt;= 10；
 * 对于 60% 的评测用例，1 &lt;= n &lt;= 100；
 * 对于所有评测用例，1 &lt;= n &lt;= 1000，0 &lt;= x, y, h &lt;= 10000。
 *
 * @author: 韦永恒
 * @date: 2020-09-09 12:38:29
 */
public class Demo9_通电 {
}
