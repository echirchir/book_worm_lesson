package dev.echirchir.bookworm

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        MainContent()
    }
}

@Composable
fun MainContent(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopStart
    ) {
        Image(
            painter = painterResource(id = R.drawable.book_background),
            contentDescription = "background image of a book",
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 24.dp)
        ) {
            MainTitle(title = "readermind")

            Spacer(modifier = Modifier.height(18.dp))

            CallToAction()

            Spacer(modifier = Modifier.height(18.dp))

            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.width(24.dp))

            Spacer(modifier = Modifier.height(8.dp))

            Subscribe()

            Spacer(modifier = Modifier.height(32.dp))

            EmailField()

            Spacer(modifier = Modifier.height(32.dp))

            SubscribeButton()
        }
    }
}

@Composable
fun MainTitle(title: String) {
    Text(
        text = title,
        fontSize = 28.sp,
        color = Color.White,
        style = TextStyle(
            fontFamily = FontFamily.Cursive
        )
    )
}

@Composable
fun CallToAction() {
    Text(
        text = "Join our community",
        fontSize = 50.sp,
        color = Color.White,
        style = TextStyle(
            lineHeight = 1.5.em,
            fontFamily = FontFamily.Default
        )
    )
}

@Composable
fun Subscribe() {
    Text(
        text = "Subscribe to our newsletter",
        fontSize = 16.sp,
        color = Color.White,
        style = TextStyle(
            fontFamily = FontFamily.Default
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailField() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text(text = "joe@gmail.com")},
        leadingIcon = { Icon(Icons.Default.Email, contentDescription = "email") },
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Black
        )
    )
}

@Composable
fun SubscribeButton() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = Color(0xFF007554))
            .fillMaxWidth()
            .height(56.dp)
    ) {
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = {}
        ) {
            Text(
                text = "Subscribe", color = Color.White)

        }
    }
}

@Composable
fun LibraryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "My Library Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
fun DiscoverScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "My Discover Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        SettingsMainContent()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsMainContent() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = "Settings",
                background = Color.White
            ){}
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.White)
                .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                UpperSection()
            }

            Spacer(modifier = Modifier.height(24.dp))

            SettingItem(icon = Icons.Default.Phone, label = "(234) 723 233 97342")

            SettingItem(icon = Icons.Default.Email, label = "philipps@googlecom")

            Spacer(modifier = Modifier.height(24.dp))

            HorizontalLine()

            WalletAndOrders()

            HorizontalLine()

            Spacer(modifier = Modifier.height(24.dp))

            SettingItem(icon = Icons.Default.FavoriteBorder, label = "Your Favorites", color = Color.Blue)

            Spacer(modifier = Modifier.height(16.dp))

            SettingItem(icon = Icons.Default.Info, label = "Payment", color = Color.Blue)

            Spacer(modifier = Modifier.height(16.dp))

            SettingItem(icon = Icons.Default.AccountCircle, label = "Tell your friend", color = Color.Blue)

            Spacer(modifier = Modifier.height(16.dp))

            SettingItem(icon = Icons.Default.ShoppingCart, label = "Promotions", color = Color.Blue)

            Spacer(modifier = Modifier.height(16.dp))

            SettingItem(icon = Icons.Default.Settings, label = "Settings", color = Color.Blue)

            Spacer(modifier = Modifier.height(16.dp))

            HorizontalLine()

            SettingItem(icon = Icons.Default.Lock, label = "Log Out", color = Color.Red, textColor = Color.Red)
        }
    }
}

@Composable
fun TopAppBar(
    modifier: Modifier = Modifier,
    background: Color = Color.Unspecified,
    alignment: Alignment = Alignment.Center,
    title: String = "",
    onClick: () -> Unit
) {
    Surface(color = background) {
        Box(
            contentAlignment = alignment,
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 24.sp
                    )
                )
            }

            Row(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        }
    }
}

@Composable
fun UpperSection(){
    Image(
        painter = painterResource(id = R.drawable.profile_image),
        contentDescription = "",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape),
        contentScale = ContentScale.FillHeight
    )

    Spacer(modifier = Modifier.width(16.dp))

    Column() {
        Text(
            text = "Emma Philipps",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Fashion Model", color = Color.DarkGray)
    }
}

@Composable
fun SettingItem(icon: ImageVector, label: String, color: Color = Color.Gray, textColor: Color = Color.DarkGray) {
    Row(modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)) {
        Icon(imageVector = icon, contentDescription = "", tint = color)
        
        Spacer(modifier = Modifier.width(16.dp))

        Text(text = label, color = textColor)
    }
}

@Composable
fun HorizontalLine() {
    Divider(modifier = Modifier
        .fillMaxWidth()
        .height(1.dp))
}

@Composable
fun WalletAndOrders() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().height(80.dp)
    ) {
        
        Column() {
            Text(
                text = "$140.0",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            Text(
                text = "Wallet",
                style = TextStyle(
                    fontSize = 16.sp
                ),
                color = Color.DarkGray
            )
        }
        
        Divider(modifier = Modifier.fillMaxHeight().width(1.dp))
        
        Column() {
            Text(
                text = "12",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            Text(
                text = "Orders",
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
    }
}












