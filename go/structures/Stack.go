package structures

//  Stack 结构定义
type Stack struct {
	nums []int
}

// NewStack 返回一个栈
func NewStack() *Stack {
	return &Stack{nums: []int{}}
}

// Push 入栈
func (s *Stack) Push(n int) {
	s.nums = append(s.nums, n)
}

// Pop 出栈
func (s *Stack) Pop() int {
	res := s.nums[len(s.nums)-1]
	s.nums = s.nums[:len(s.nums)-1]
	return res
}

// Len 栈的长度
func (s *Stack) Len() int {
	return len(s.nums)
}

// IsEmpty 是否为空

func (s *Stack) IsEmpty() bool {
	return s.Len() == 0
}
