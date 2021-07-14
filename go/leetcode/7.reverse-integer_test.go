/*
 * @lc app=leetcode id=7 lang=golang
 *
 * [7] Reverse Integer
 */
package leetcode

import "testing"

func Test_reverse(t *testing.T) {
	type args struct {
		x int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		// TODO: Add test cases.
		{
			name: "正数",
			args: args{123},
			want: 321,
		},
		{
			name: "负数",
			args: args{-123},
			want: -321,
		},
		{
			name: "零",
			args: args{0},
			want: 0,
		},
		{
			name: "特别大的数",
			args: args{12312321144},
			want: 0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverse(tt.args.x); got != tt.want {
				t.Errorf("reverse() = %v, want %v", got, tt.want)
			}
		})
	}
}
