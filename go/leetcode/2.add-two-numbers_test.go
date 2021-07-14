package leetcode

import (
	"leetcode_go/structures"
	"reflect"
	"testing"
)

/*
 * @lc app=leetcode id=2 lang=golang
 *
 * [2] Add Two Numbers
 */

// @lc code=start
func Test_addTwoNumbers(t *testing.T) {
	type args struct {
		l1 *ListNode
		l2 *ListNode
	}
	tests := []struct {
		name string
		args args
		want *ListNode
	}{
		// TODO: Add test cases.
		{
			name: "string",
			args: args{
				l1: structures.Ints2List([]int{1, 3, 4, 5}),
				l2: structures.Ints2List([]int{1, 3, 4, 5}),
			},
			want: structures.Ints2List([]int{2, 6, 8, 0, 1}),
		},
		{
			name: "string",
			args: args{
				l1: structures.Ints2List([]int{1, 2, 3, 4}),
				l2: structures.Ints2List([]int{1, 2, 3, 4}),
			},
			want: structures.Ints2List([]int{2, 4, 6, 8}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := addTwoNumbers(tt.args.l1, tt.args.l2); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("addTwoNumbers() = %v, want %v", got, tt.want)
			}
		})
	}
}
