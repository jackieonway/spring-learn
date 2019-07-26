import com.jackieonway.spring.HelloDao4
import com.jackieonway.spring.HelloService4

beans{
    helloDao4(HelloDao4)

    helloService4(HelloService4){
        helloDao = helloDao4
    }
}