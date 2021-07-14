package structures

// Queue 队列结构定义
type Queue struct {
	nums []int
}

// NewQueue
func NewQueue() *Queue {
	return &Queue{nums: []int{}}
}

// Push 入队列
func (q *Queue) Push(n int) {
	q.nums = append(q.nums, n)
}

// Pop 出队列
func (q *Queue) Pop() int {
	res := q.nums[0]
	q.nums = q.nums[1:]
	return res
}

// Len 长度
func (q *Queue) Len() int {
	return len(q.nums)
}

// IsEmpty 是否为空
func (q *Queue) IsEmpty() bool {
	return q.Len() == 0
}
