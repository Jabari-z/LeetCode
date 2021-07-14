/*
 * @lc app=leetcode id=150 lang=golang
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
package leetcode

import "strconv"

func evalRPN(tokens []string) int {
	// 遇到数组 入栈 遇到运算符 出栈顶2个元素 然后入栈
	if len(tokens) == 1 {
		i, _ := strconv.Atoi(tokens[0])
		return i
	}

	stack, top := []int{}, 0
	for _, t := range tokens {
		switch t {
		case "+":
			{
				sum := stack[top-2] + stack[top-1]
				stack = stack[:top-2]
				stack = append(stack, sum)
				top--
			}
		case "-":
			{
				sub := stack[top-2] - stack[top-1]
				stack = stack[:top-2]
				stack = append(stack, sub)
				top--
			}
		case "*":
			{
				mul := stack[top-2] * stack[top-1]
				stack = stack[:top-2]
				stack = append(stack, mul)
				top--
			}
		case "/":
			{
				div := stack[top-2] / stack[top-1]
				stack = stack[:top-2]
				stack = append(stack, div)
				top--
			}
		default:
			{
				i, _ := strconv.Atoi(t)
				stack = append(stack, i)
				top++
			}

		}
	}
	return stack[0]
}

// @lc code=end
