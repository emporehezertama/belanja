package belanja.id.feature_product.domain.model

import androidx.navigation.ActivityNavigator

sealed class BottomNavItem(var icon: Int, var destination: ActivityNavigator.Destination) {
//    object Home : BottomNavItem(
//        icon = R.drawable.ic_home,
//        destination = HomeScreenDestination
//    )
//
//    object Wishlist : BottomNavItem(
//        icon = R.drawable.ic_heart,
//        destination = WishlistScreenDestination
//    )
//
//    object Cart : BottomNavItem(
//        icon = R.drawable.ic_basket,
//        destination = CartScreenDestination
//    )
//
//    object Account : BottomNavItem(
//        icon = R.drawable.ic_user,
//        destination = AccountScreenDestination
//    )
}
