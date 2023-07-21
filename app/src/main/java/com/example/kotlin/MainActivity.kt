package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.ui.theme.KotlinTheme


/*
* 1. Activity가 실행, 종료 생명주기
* 2. 다른 앱 실행 시(홈버튼), 생명주기
* 3. 다른 Activity 실행 시, 생명주기
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val view = View(this)
//        view.setOnClickListener { println("람다") }
        setContent {
            KotlinTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//                Greeting("Android")
//                ButtonExample(onButtonClicked = {
//                    Toast.makeText(this,"Send Clicked",Toast.LENGTH_SHORT).show()
//                })

//                ModifierExample()
                SurfaceExample(name = "IOS??");
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        modifier = Modifier.fillMaxSize(),
        text = "Hello $name\nHello $name\nHello $name",
//        color = Color.Red
//        color = Color(0xffff9944)
        color = Color(0xffeeddccbbaa),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 2.sp,
        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center,
    )
}

/*
@Composable
fun ButtonExample(onButtonClicked:()->Unit){
    Button(onClick = onButtonClicked, enabled = true,
    border = BorderStroke(10.dp,Color.Magenta),
        // shape === border-radius
    shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ){
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = "Send"
        )
        // ButtonDefaults에서 기본적으로 제공하는 IconSpacing으로 사이즈가 있음
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}
*/

@Composable
fun ModifierExample(){
    Button(onClick = {},modifier= Modifier
        .size(300.dp)
        .padding(50.dp),
        // width, height 모두 사용한다면 size가 더 생산적
        // height(100.dp).width(200.dp)
            colors = ButtonDefaults.buttonColors(
                // backgroundColor가 containerColor로 변경된듯
                containerColor = Color.Magenta,
                contentColor = Color.Cyan,
            ),
            shape = RoundedCornerShape(0),

    ){
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Search",
            modifier = Modifier.background(Color.Blue)

        )
        Spacer(
            modifier = Modifier
                .size(ButtonDefaults.IconSpacing)
                .background(Color.Green)

        )
        Text("Search", modifier = Modifier.background(Color.Yellow))}
}

@Composable
fun SurfaceExample(name : String){
    Surface(
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp,
        border = BorderStroke(width = 2.dp, color = Color.Magenta),
        shape = CircleShape,
        color = MaterialTheme.colorScheme.error


    ){
        Text(text="Hello $name",modifier = Modifier.padding(8.dp))

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinTheme {
//        Greeting("Android")
//        ButtonExample(onButtonClicked = {})
//        ModifierExample()
        SurfaceExample("IOS!!")
    }

}