package belanja.id.feature_profile.presentation.account

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import belanja.id.R
import belanja.id.core.presentation.theme.GrayColor
import belanja.id.core.presentation.theme.YellowMain
import belanja.id.core.util.Constants
import belanja.id.core.util.UiEvents
import belanja.id.feature_profile.domain.model.Account
import belanja.id.feature_profile.domain.model.User
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.flow.collectLatest
import java.util.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Destination
@Composable
fun AccountScreen(
    viewModel: ProfileViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
) {
    LaunchedEffect(key1 = true, block = {
        viewModel.getProfile()
    })
    val user = viewModel.profileState.value

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is UiEvents.SnackbarEvent -> {
                    event.message.let {
                        scaffoldState.snackbarHostState.showSnackbar(
                            message = it,
                            duration = SnackbarDuration.Short
                        )
                    }
                }
                is UiEvents.NavigateEvent -> {
//                    navigator.navigate(event.route) {
//                        popUpTo(AccountScreenDestination.route) {
//                            inclusive = false
//                        }
//                        popUpTo(HomeScreenDestination.route) {
//                            inclusive = false
//                        }
//                        popUpTo(WishlistScreenDestination.route) {
//                            inclusive = false
//                        }
//                        popUpTo(CartScreenDestination.route) {
//                            inclusive = false
//                        }
//                    }
                }
            }
        }
    }

    Scaffold(
        backgroundColor = Color.White,
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                elevation = 1.dp,
                backgroundColor = Color.White,
                title = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "My Profile",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            )
        }
    ) {
        AccountScreenContent(
            user = user,
            onClickSignOut = {
                viewModel.logout()
            }
        )
    }
}

@Composable
private fun AccountScreenContent(
    user: User,
    onClickSignOut: () -> Unit,
) {
    LazyColumn {
        item {
            UserItem(
                user = user,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .padding(4.dp)
            )
        }
        items(accountItems) { item ->
            Card(
                modifier = Modifier.padding(8.dp),
                border = BorderStroke(0.3.dp, GrayColor),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = item.title,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = item.content,
                            color = Color.Black,
                            fontWeight = FontWeight.Light,
                            fontSize = 12.sp
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                modifier = Modifier.padding(8.dp),
                onClick = onClickSignOut,
                shape = RoundedCornerShape(8)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    text = "Sign Out",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun UserItem(
    user: User,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        elevation = 3.dp
    ) {
        Row {
            Image(
                painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current)
                        .data(data = Constants.AVATAR_URL)
                        .apply(block = fun ImageRequest.Builder.() {
                            placeholder(R.drawable.ic_placeholder)
                            crossfade(true)
                        }).build()
                ),
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .weight(1f)
                    .clip(CircleShape)
                    .fillMaxHeight(),
                contentScale = ContentScale.Inside
            )
            Spacer(modifier = Modifier.width(5.dp))

            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(5.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "${
                        user.firstName?.replaceFirstChar {
                            if (it.isLowerCase()) it.titlecase(
                                Locale.getDefault()
                            ) else it.toString()
                        }
                    }  ${
                        user.lastName?.replaceFirstChar {
                            if (it.isLowerCase()) it.titlecase(
                                Locale.getDefault()
                            ) else it.toString()
                        }
                    }",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "@${user.email}",
                    color = Color.Black,
                    fontSize = 16.sp,
                    maxLines = 3,
                    fontWeight = FontWeight.Light
                )
                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    modifier = Modifier.align(End),
                    onClick = {
                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        backgroundColor = YellowMain
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(3.dp),
                        fontSize = 11.sp,
                        textAlign = TextAlign.Center,
                        text = "Edit profile"
                    )
                }
            }
        }
    }
}

private val accountItems = listOf(
    Account(
        "My Orders",
        "You have 0 completed orders"
    ),
    Account(
        "Shipping Address",
        "1 addresses have been set"
    ),
    Account(
        "Update Password",
        "Change your password"
    ),
    Account(
        "Delete Account",
        "Delete your account"
    )
)
