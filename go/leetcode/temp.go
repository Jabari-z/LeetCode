package leetcode

func AppandSlice() (res []int) {
	slice := []int{1, 2, 3, 4, 5, 6, 7}

	res = append(res, slice...)
	return
}
