package com.f776.composearticle

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import composearticle.composeapp.generated.resources.Res
import composearticle.composeapp.generated.resources.article_body
import composearticle.composeapp.generated.resources.article_subtitle
import composearticle.composeapp.generated.resources.article_title
import composearticle.composeapp.generated.resources.bg_compose_background
import composearticle.composeapp.generated.resources.compose_multiplatform
import composearticle.composeapp.generated.resources.ic_task_completed
import composearticle.composeapp.generated.resources.quadrant_1_body
import composearticle.composeapp.generated.resources.quadrant_1_title
import composearticle.composeapp.generated.resources.quadrant_2_body
import composearticle.composeapp.generated.resources.quadrant_2_title
import composearticle.composeapp.generated.resources.quadrant_3_body
import composearticle.composeapp.generated.resources.quadrant_3_title
import composearticle.composeapp.generated.resources.quadrant_4_body
import composearticle.composeapp.generated.resources.quadrant_4_title
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App() {
    val color1 = Color(0xFFEADDFF)
    val color2 = Color(0xFFD0BCFF)
    val color3 = Color(0xFFB69DF8)
    val color4 = Color(0xFFF6EDFF)

    MaterialTheme {
        Column {
            Row(
                modifier = Modifier.fillMaxHeight()
                    .weight(1f, true)
            ) {
                Quadrant(
                    title = stringResource(Res.string.quadrant_1_title),
                    body = stringResource(Res.string.quadrant_1_body),
                    bgColor = color1,
                    modifier = Modifier.weight(1f, true)
                )
                Quadrant(
                    title = stringResource(Res.string.quadrant_2_title),
                    body = stringResource(Res.string.quadrant_2_body),
                    bgColor = color2,
                    modifier = Modifier.weight(1f, true)
                )
            }

            Row(
                modifier = Modifier.fillMaxHeight()
                    .weight(1f, true)
            ) {
                Quadrant(
                    title = stringResource(Res.string.quadrant_3_title),
                    body = stringResource(Res.string.quadrant_3_body),
                    bgColor = color3,
                    modifier = Modifier.weight(1f, true)
                )

                Quadrant(
                    title = stringResource(Res.string.quadrant_4_title),
                    body = stringResource(Res.string.quadrant_4_body),
                    bgColor = color4,
                    modifier = Modifier.weight(1f, true)
                )
            }
        }


    }
}

@Composable
fun Quadrant(title: String, body: String, bgColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.background(bgColor)
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}


//@Composable
//@Preview
//fun App() {
//    MaterialTheme {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Image(
//                painter = painterResource(Res.drawable.ic_task_completed),
//                contentDescription = null,
//                modifier = Modifier.fillMaxWidth()
//            )
//
//            Text(
//                text = "All tasks completed",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
//            )
//
//            Text(
//                text = "Nice work!",
//                fontSize = 16.sp
//            )
//        }
//
//    }
//}


//@Composable
//@Preview
//fun App() {
//    MaterialTheme {
//        Column {
//            Image(
//                painter = painterResource(Res.drawable.bg_compose_background),
//                contentDescription = null,
//                modifier = Modifier.fillMaxWidth()
//            )
//
//            Text(
//                text = stringResource(Res.string.article_title),
//                fontSize = 24.sp,
//                modifier = Modifier.padding(16.dp)
//            )
//
//            Text(
//                text = stringResource(Res.string.article_subtitle),
//                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
//                textAlign = TextAlign.Justify
//            )
//
//            Text(
//                text = stringResource(Res.string.article_body),
//                modifier = Modifier.padding(16.dp),
//                textAlign = TextAlign.Justify
//            )
//        }
//
//    }
//}