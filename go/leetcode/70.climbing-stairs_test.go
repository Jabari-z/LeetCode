package leetcode

import "testing"

func Test_climbStairs(t *testing.T) {
	tests := []struct {
		name string
		args int
		want int
	}{
		// TODO: Add test cases.
		{
			name: "1",
			args: 3,
			want: 3,
		},
		{
			name: "1",
			args: 4,
			want: 5,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := climbStairs(tt.args); got != tt.want {
				t.Errorf("climbStairs() = %v, want %v", got, tt.want)
			}
		})
	}
}
