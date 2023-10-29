//  go build app.go - сборка exe
//  go run app.go - запуск без сборки
package main

import (
	"fmt"
	"time"
)
func main(){
	var(
		a float64 = 3.1415926
		b float64 = 2.718	
	)
	fmt.Println("Speed test run GO!")
	start := time.Now()
	for i := 0; i < 100000000; i++ {
		a+=b
	}
	fmt.Println(time.Since(start))
	fmt.Println(int32(a))
}