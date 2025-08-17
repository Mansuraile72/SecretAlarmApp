# 📘 Project Auto Documentation

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\Alarm.kt
**Classes:** Alarm

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AlarmAdapter.kt
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.genius.tdlibandroid.Alarm
import com.genius.tdlibandroid.R
```

**Classes:** AlarmAdapter, AlarmViewHolder

**Functions:** onItemClick, onSwitchToggle, onCreateViewHolder, onBindViewHolder, getItemCount

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AlarmReceiver.kt
**Imports:**
```
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import androidx.core.content.ContextCompat
```

**Classes:** AlarmReceiver

**Functions:** onReceive

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AlarmService.kt
**Imports:**
```
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
```

**Classes:** AlarmService

**Functions:** onBind, onStartCommand, playAlarmSound, buildNotification, createChannelIfNeeded, onDestroy

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AppModule.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.TelegramClientImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
```

**Classes:** AppModule

**Functions:** bindTelegramClient

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AppNavGrap.kt
**Imports:**
```
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.genius.tdlibandroid.presentation.chat.ChatScreen
import com.genius.tdlibandroid.presentation.home.HomeScreen
import com.genius.tdlibandroid.presentation.home.HomeViewModel
```

**Functions:** AppNavGraph

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AuthDebugActivity.kt
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
```

**Classes:** AuthDebugActivity

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\AuthState.kt
**Classes:** AuthState, Error

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\ChatScreen.kt
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import org.drinkless.tdlib.TdApi
```

**Functions:** ChatScreen, MessageBubble

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\ChatViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatUiState, ChatViewModel

**Functions:** init, startUpdates, onInputChange, sendMessage, onCleared

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\Color.kt
**Imports:**
```
import androidx.compose.ui.graphics.Color
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\ExampleInstrumentedTest.kt
**Imports:**
```
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
```

**Classes:** ExampleInstrumentedTest

**Functions:** useAppContext

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\ExampleUnitTest.kt
**Imports:**
```
import org.junit.Test
import org.junit.Assert.*
```

**Classes:** ExampleUnitTest

**Functions:** addition_isCorrect

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\HiddenTelegramActivity.kt
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.login.LoginScreen
import com.genius.tdlibandroid.presentation.navigation.AppNavGraph
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import com.genius.tdlibandroid.ui.theme.TDLibAndroidTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivity

**Functions:** onCreate, App

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\HomeActivity.kt
**Imports:**
```
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.genius.tdlibandroid.R
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject
```

**Classes:** HomeActivity

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\HomeScreen.kt
**Imports:**
```
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.drinkless.tdlib.TdApi
```

**Functions:** HomeScreen, ChatItem

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\HomeViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** HomeViewModel

**Functions:** loadChats

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\LoginScreen.kt
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.genius.tdlibandroid.data.AuthState
```

**Functions:** LoginScreen

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\LoginStates.kt
**Classes:** LoginStates, InsertNumber, InsertCode, InsertPassword

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\LoginViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
```

**Classes:** LoginViewModel

**Functions:** sendPhoneNumber, sendCode, sendPassword

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\MainActivity.kt
**Imports:**
```
import android.Manifest
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
```

**Classes:** MainActivity

**Functions:** onCreate, checkAndRequestExactAlarmPermission, askForNotificationPermission, setupRecyclerView, showAlarmDialog, scheduleNormalAlarm, scheduleAlarm, cancelAlarm, onItemClick, onSwitchToggle

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\MyApp.kt
**Imports:**
```
import androidx.multidex.MultiDexApplication
import com.genius.tdlibandroid.data.TgCore
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
```

**Classes:** MyApp

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\NavRoutes.kt
**Functions:** chat

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\Screen.kt
**Imports:**
```
import androidx.navigation.NavBackStackEntry
```

**Classes:** Screen

**Functions:** buildRoute, getChatId

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\SplashScreen.kt
**Imports:**
```
import androidx.compose.runtime.Composable
```

**Functions:** SplashScreen

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\SplashViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** SplashViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TelegramClient.kt
**Imports:**
```
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
```

**Functions:** send, setPhoneNumber, checkCode, checkPassword, logOut, getMe, getChats, getChat, searchChats, openChat, closeChat, getChatHistory, getMessage, viewMessages, sendTyping, sendTextMessage, editMessageText, deleteMessages, downloadFile, getFile

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TelegramClientImpl.kt
**Imports:**
```
import android.content.Context
import android.os.Build
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
```

**Classes:** TelegramClientImpl

**Functions:** handleAuthorizationState, setupTdlibParameters, send, setPhoneNumber, checkCode, checkPassword, logOut, getMe, getChats, getChat, openChat, closeChat, getChatHistory, getMessage, viewMessages, sendTyping, sendTextMessage, searchChats, editMessageText, deleteMessages, downloadFile, getFile

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgAuthRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgAuthRepository

**Functions:** setPhoneNumber, checkCode, checkPassword, logOut

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgBaseViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
```

**Classes:** TgBaseViewModel

**Functions:** getAuthStatus

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgChatRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgChatRepository

**Functions:** openChat, closeChat, getHistory, sendText, markRead, sendTyping, getMessage

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgCore.kt
**Imports:**
```
import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgCore

**Functions:** initialize, setPhone

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgErrors.kt
**Classes:** TgValidationError

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgUserAuthState.kt
## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\TgUserRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgUserRepository

**Functions:** getMe, getChats, getChat

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\Theme.kt
**Imports:**
```
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
```

**Functions:** TDLibAndroidTheme

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\project-inventory-20250816_230724\all-project-files\Type.kt
**Imports:**
```
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\.gradle\8.7\dependencies-accessors\23201f89ac621c997df5153520236fa24e75d498\sources\org\gradle\accessors\dm\LibrariesForLibs.java
**Imports:**
```
import org.gradle.api.NonNullApi
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.plugin.use.PluginDependency
import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.MutableVersionConstraint
import org.gradle.api.provider.Provider
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory
import org.gradle.api.internal.catalog.DefaultVersionCatalog
import java.util.Map
import org.gradle.api.internal.attributes.ImmutableAttributesFactory
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser
import javax.inject.Inject
```

**Classes:** LibrariesForLibs, AccompanistLibraryAccessors, AndroidxLibraryAccessors, AndroidxActivityLibraryAccessors, AndroidxComposeLibraryAccessors, AndroidxCoreLibraryAccessors, AndroidxEspressoLibraryAccessors, AndroidxLifecycleLibraryAccessors, AndroidxLifecycleRuntimeLibraryAccessors, AndroidxLifecycleViewmodelLibraryAccessors, AndroidxPagingLibraryAccessors, AndroidxUiLibraryAccessors, AndroidxUiTestLibraryAccessors, AndroidxUiToolingLibraryAccessors, HiltLibraryAccessors, HiltNavigationLibraryAccessors, KotlinxLibraryAccessors, KotlinxCoroutinesLibraryAccessors, VersionAccessors, BundleAccessors, PluginAccessors, AndroidPluginAccessors, HiltPluginAccessors, JetbrainsPluginAccessors, JetbrainsKotlinPluginAccessors

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\.gradle\8.7\dependencies-accessors\23201f89ac621c997df5153520236fa24e75d498\sources\org\gradle\accessors\dm\LibrariesForLibsInPluginsBlock.java
**Imports:**
```
import org.gradle.api.NonNullApi
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.plugin.use.PluginDependency
import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.MutableVersionConstraint
import org.gradle.api.provider.Provider
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory
import org.gradle.api.internal.catalog.DefaultVersionCatalog
import java.util.Map
import org.gradle.api.internal.attributes.ImmutableAttributesFactory
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser
import javax.inject.Inject
```

**Classes:** LibrariesForLibsInPluginsBlock, AccompanistLibraryAccessors, AndroidxLibraryAccessors, AndroidxActivityLibraryAccessors, AndroidxComposeLibraryAccessors, AndroidxCoreLibraryAccessors, AndroidxEspressoLibraryAccessors, AndroidxLifecycleLibraryAccessors, AndroidxLifecycleRuntimeLibraryAccessors, AndroidxLifecycleViewmodelLibraryAccessors, AndroidxPagingLibraryAccessors, AndroidxUiLibraryAccessors, AndroidxUiTestLibraryAccessors, AndroidxUiToolingLibraryAccessors, HiltLibraryAccessors, HiltNavigationLibraryAccessors, KotlinxLibraryAccessors, KotlinxCoroutinesLibraryAccessors, VersionAccessors, BundleAccessors, PluginAccessors, AndroidPluginAccessors, HiltPluginAccessors, JetbrainsPluginAccessors, JetbrainsKotlinPluginAccessors

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\debug\out\com\genius\tdlibandroid\databinding\ActivityAuthDebugBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.Group
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityAuthDebugBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\debug\out\com\genius\tdlibandroid\databinding\ActivityHomeBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityHomeBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\debug\out\com\genius\tdlibandroid\databinding\ActivityMainBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityMainBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\debug\out\com\genius\tdlibandroid\databinding\AlarmItemBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.cardview.widget.CardView
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import com.google.android.material.switchmaterial.SwitchMaterial
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** AlarmItemBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\debug\out\com\genius\tdlibandroid\databinding\DialogAddAlarmBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TimePicker
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** DialogAddAlarmBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\release\out\com\genius\tdlibandroid\databinding\ActivityAuthDebugBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.Group
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityAuthDebugBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\release\out\com\genius\tdlibandroid\databinding\ActivityHomeBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityHomeBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\release\out\com\genius\tdlibandroid\databinding\ActivityMainBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** ActivityMainBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\release\out\com\genius\tdlibandroid\databinding\AlarmItemBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.cardview.widget.CardView
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import com.google.android.material.switchmaterial.SwitchMaterial
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** AlarmItemBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\data_binding_base_class_source_out\release\out\com\genius\tdlibandroid\databinding\DialogAddAlarmBinding.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TimePicker
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.genius.tdlibandroid.R
import java.lang.NullPointerException
import java.lang.Override
import java.lang.String
```

**Classes:** DialogAddAlarmBinding

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\debug\com\genius\tdlibandroid\DaggerMyApp_HiltComponents_SingletonC.java
**Imports:**
```
import android.app.Activity
import android.app.Service
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.core.TgBaseViewModel
import com.genius.tdlibandroid.core.TgBaseViewModel_HiltModules
import com.genius.tdlibandroid.data.TelegramClientImpl
import com.genius.tdlibandroid.data.TgCore
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity_MembersInjector
import com.genius.tdlibandroid.presentation.chat.ChatViewModel
import com.genius.tdlibandroid.presentation.chat.ChatViewModel_HiltModules
import com.genius.tdlibandroid.presentation.home.HomeActivity
import com.genius.tdlibandroid.presentation.home.HomeActivity_MembersInjector
import com.genius.tdlibandroid.presentation.home.HomeViewModel
import com.genius.tdlibandroid.presentation.home.HomeViewModel_HiltModules
import com.genius.tdlibandroid.presentation.login.LoginViewModel
import com.genius.tdlibandroid.presentation.login.LoginViewModel_HiltModules
import com.genius.tdlibandroid.presentation.splash.SplashViewModel
import com.genius.tdlibandroid.presentation.splash.SplashViewModel_HiltModules
import com.google.errorprone.annotations.CanIgnoreReturnValue
import dagger.hilt.android.ActivityRetainedLifecycle
import dagger.hilt.android.ViewModelLifecycle
import dagger.hilt.android.internal.builders.ActivityComponentBuilder
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
import dagger.hilt.android.internal.builders.FragmentComponentBuilder
import dagger.hilt.android.internal.builders.ServiceComponentBuilder
import dagger.hilt.android.internal.builders.ViewComponentBuilder
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory
import dagger.internal.DaggerGenerated
import dagger.internal.DoubleCheck
import dagger.internal.IdentifierNameString
import dagger.internal.KeepFieldType
import dagger.internal.LazyClassKeyMap
import dagger.internal.MapBuilder
import dagger.internal.Preconditions
import dagger.internal.Provider
import java.util.Collections
import java.util.Map
import java.util.Set
```

**Classes:** DaggerMyApp_HiltComponents_SingletonC, Builder, ActivityRetainedCBuilder, ActivityCBuilder, FragmentCBuilder, ViewWithFragmentCBuilder, ViewCBuilder, ViewModelCBuilder, ServiceCBuilder, ViewWithFragmentCImpl, FragmentCImpl, ViewCImpl, ActivityCImpl, LazyClassKeyProvider, ViewModelCImpl, LazyClassKeyProvider, SwitchingProvider, ActivityRetainedCImpl, SwitchingProvider, ServiceCImpl, SingletonCImpl, SwitchingProvider

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\debug\com\genius\tdlibandroid\Hilt_MyApp.java
**Imports:**
```
import androidx.annotation.CallSuper
import androidx.multidex.MultiDexApplication
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.internal.managers.ComponentSupplier
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\debug\com\genius\tdlibandroid\MyApp_HiltComponents.java
**Imports:**
```
import com.genius.tdlibandroid.core.TgBaseViewModel_HiltModules
import com.genius.tdlibandroid.di.AppModule
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity_GeneratedInjector
import com.genius.tdlibandroid.presentation.chat.ChatViewModel_HiltModules
import com.genius.tdlibandroid.presentation.home.HomeActivity_GeneratedInjector
import com.genius.tdlibandroid.presentation.home.HomeViewModel_HiltModules
import com.genius.tdlibandroid.presentation.login.LoginViewModel_HiltModules
import com.genius.tdlibandroid.presentation.splash.SplashViewModel_HiltModules
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.components.ViewWithFragmentComponent
import dagger.hilt.android.flags.FragmentGetContextFix
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule
import dagger.hilt.android.internal.builders.ActivityComponentBuilder
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
import dagger.hilt.android.internal.builders.FragmentComponentBuilder
import dagger.hilt.android.internal.builders.ServiceComponentBuilder
import dagger.hilt.android.internal.builders.ViewComponentBuilder
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.FragmentComponentManager
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule
import dagger.hilt.android.internal.managers.ServiceComponentManager
import dagger.hilt.android.internal.managers.ViewComponentManager
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ServiceScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.android.scopes.ViewScoped
import dagger.hilt.components.SingletonComponent
import dagger.hilt.internal.GeneratedComponent
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton
```

**Classes:** MyApp_HiltComponents, SingletonC, ServiceC, ActivityRetainedC, ActivityC, ViewModelC, ViewC, FragmentC, ViewWithFragmentC

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\release\com\genius\tdlibandroid\DaggerMyApp_HiltComponents_SingletonC.java
**Imports:**
```
import android.app.Activity
import android.app.Service
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.core.TgBaseViewModel
import com.genius.tdlibandroid.core.TgBaseViewModel_HiltModules
import com.genius.tdlibandroid.data.TelegramClientImpl
import com.genius.tdlibandroid.data.TgCore
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity_MembersInjector
import com.genius.tdlibandroid.presentation.chat.ChatViewModel
import com.genius.tdlibandroid.presentation.chat.ChatViewModel_HiltModules
import com.genius.tdlibandroid.presentation.home.HomeActivity
import com.genius.tdlibandroid.presentation.home.HomeActivity_MembersInjector
import com.genius.tdlibandroid.presentation.home.HomeViewModel
import com.genius.tdlibandroid.presentation.home.HomeViewModel_HiltModules
import com.genius.tdlibandroid.presentation.login.LoginViewModel
import com.genius.tdlibandroid.presentation.login.LoginViewModel_HiltModules
import com.genius.tdlibandroid.presentation.splash.SplashViewModel
import com.genius.tdlibandroid.presentation.splash.SplashViewModel_HiltModules
import com.google.errorprone.annotations.CanIgnoreReturnValue
import dagger.hilt.android.ActivityRetainedLifecycle
import dagger.hilt.android.ViewModelLifecycle
import dagger.hilt.android.internal.builders.ActivityComponentBuilder
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
import dagger.hilt.android.internal.builders.FragmentComponentBuilder
import dagger.hilt.android.internal.builders.ServiceComponentBuilder
import dagger.hilt.android.internal.builders.ViewComponentBuilder
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory
import dagger.internal.DaggerGenerated
import dagger.internal.DoubleCheck
import dagger.internal.IdentifierNameString
import dagger.internal.KeepFieldType
import dagger.internal.LazyClassKeyMap
import dagger.internal.MapBuilder
import dagger.internal.Preconditions
import dagger.internal.Provider
import java.util.Collections
import java.util.Map
import java.util.Set
```

**Classes:** DaggerMyApp_HiltComponents_SingletonC, Builder, ActivityRetainedCBuilder, ActivityCBuilder, FragmentCBuilder, ViewWithFragmentCBuilder, ViewCBuilder, ViewModelCBuilder, ServiceCBuilder, ViewWithFragmentCImpl, FragmentCImpl, ViewCImpl, ActivityCImpl, LazyClassKeyProvider, ViewModelCImpl, LazyClassKeyProvider, SwitchingProvider, ActivityRetainedCImpl, SwitchingProvider, ServiceCImpl, SingletonCImpl, SwitchingProvider

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\release\com\genius\tdlibandroid\Hilt_MyApp.java
**Imports:**
```
import androidx.annotation.CallSuper
import androidx.multidex.MultiDexApplication
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.internal.managers.ComponentSupplier
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_sources\release\com\genius\tdlibandroid\MyApp_HiltComponents.java
**Imports:**
```
import com.genius.tdlibandroid.core.TgBaseViewModel_HiltModules
import com.genius.tdlibandroid.di.AppModule
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity_GeneratedInjector
import com.genius.tdlibandroid.presentation.chat.ChatViewModel_HiltModules
import com.genius.tdlibandroid.presentation.home.HomeActivity_GeneratedInjector
import com.genius.tdlibandroid.presentation.home.HomeViewModel_HiltModules
import com.genius.tdlibandroid.presentation.login.LoginViewModel_HiltModules
import com.genius.tdlibandroid.presentation.splash.SplashViewModel_HiltModules
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.components.ViewWithFragmentComponent
import dagger.hilt.android.flags.FragmentGetContextFix
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule
import dagger.hilt.android.internal.builders.ActivityComponentBuilder
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
import dagger.hilt.android.internal.builders.FragmentComponentBuilder
import dagger.hilt.android.internal.builders.ServiceComponentBuilder
import dagger.hilt.android.internal.builders.ViewComponentBuilder
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.FragmentComponentManager
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule
import dagger.hilt.android.internal.managers.ServiceComponentManager
import dagger.hilt.android.internal.managers.ViewComponentManager
import dagger.hilt.android.internal.modules.ApplicationContextModule
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ServiceScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.android.scopes.ViewScoped
import dagger.hilt.components.SingletonComponent
import dagger.hilt.internal.GeneratedComponent
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton
```

**Classes:** MyApp_HiltComponents, SingletonC, ServiceC, ActivityRetainedC, ActivityC, ViewModelC, ViewC, FragmentC, ViewWithFragmentC

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_trees\debug\com\genius\tdlibandroid\MyApp_ComponentTreeDeps.java
**Imports:**
```
import dagger.hilt.internal.aggregatedroot.codegen._com_genius_tdlibandroid_MyApp
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent
import hilt_aggregated_deps._com_genius_tdlibandroid_MyApp_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_di_AppModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule
```

**Classes:** MyApp_ComponentTreeDeps

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_trees\debug\dagger\hilt\internal\processedrootsentinel\codegen\_com_genius_tdlibandroid_MyApp.java
**Imports:**
```
import dagger.hilt.internal.processedrootsentinel.ProcessedRootSentinel
```

**Classes:** _com_genius_tdlibandroid_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_trees\release\com\genius\tdlibandroid\MyApp_ComponentTreeDeps.java
**Imports:**
```
import dagger.hilt.internal.aggregatedroot.codegen._com_genius_tdlibandroid_MyApp
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent
import hilt_aggregated_deps._com_genius_tdlibandroid_MyApp_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_di_AppModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule
import hilt_aggregated_deps._com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_SavedStateHandleModule
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule
```

**Classes:** MyApp_ComponentTreeDeps

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\hilt\component_trees\release\dagger\hilt\internal\processedrootsentinel\codegen\_com_genius_tdlibandroid_MyApp.java
**Imports:**
```
import dagger.hilt.internal.processedrootsentinel.ProcessedRootSentinel
```

**Classes:** _com_genius_tdlibandroid_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\MyApp_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.components.SingletonComponent
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\MyApp_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TgCore
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** MyApp_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\core\TgBaseViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgBaseViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\core\TgBaseViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** TgBaseViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\core\TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** TgBaseViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\data\TelegramClientImpl_Factory.java
**Imports:**
```
import android.content.Context
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TelegramClientImpl_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\data\TgCore_Factory.java
**Imports:**
```
import android.content.Context
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgCore_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\data\tgRepos\TgAuthRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgAuthRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\data\tgRepos\TgChatRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgChatRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\data\tgRepos\TgUserRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgUserRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\HiddenTelegramActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\HiddenTelegramActivity_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** HiddenTelegramActivity_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\Hilt_HiddenTelegramActivity.java
**Imports:**
```
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.contextaware.OnContextAvailableListener
import androidx.annotation.CallSuper
import androidx.annotation.Nullable
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.internal.GeneratedComponentManager
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_HiddenTelegramActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\chat\ChatViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** ChatViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\chat\ChatViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** ChatViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\chat\ChatViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** ChatViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\Hilt_HomeActivity.java
**Imports:**
```
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.contextaware.OnContextAvailableListener
import androidx.annotation.CallSuper
import androidx.annotation.Nullable
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.internal.GeneratedComponentManager
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_HomeActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\HomeActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\HomeActivity_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** HomeActivity_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\HomeViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** HomeViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\HomeViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** HomeViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\home\HomeViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** HomeViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\login\LoginViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** LoginViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\login\LoginViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** LoginViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\login\LoginViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** LoginViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\splash\SplashViewModel_Factory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** SplashViewModel_Factory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\splash\SplashViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** SplashViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\com\genius\tdlibandroid\presentation\splash\SplashViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** SplashViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\dagger\hilt\internal\aggregatedroot\codegen\_com_genius_tdlibandroid_MyApp.java
**Imports:**
```
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.internal.aggregatedroot.AggregatedRoot
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_di_AppModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_di_AppModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_MyApp_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_MyApp_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\debug\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\MyApp_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.components.SingletonComponent
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\MyApp_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TgCore
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** MyApp_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\core\TgBaseViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgBaseViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\core\TgBaseViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** TgBaseViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\core\TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** TgBaseViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\data\TelegramClientImpl_Factory.java
**Imports:**
```
import android.content.Context
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TelegramClientImpl_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\data\TgCore_Factory.java
**Imports:**
```
import android.content.Context
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgCore_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\data\tgRepos\TgAuthRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgAuthRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\data\tgRepos\TgChatRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgChatRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\data\tgRepos\TgUserRepository_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** TgUserRepository_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\HiddenTelegramActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\HiddenTelegramActivity_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** HiddenTelegramActivity_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\Hilt_HiddenTelegramActivity.java
**Imports:**
```
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.contextaware.OnContextAvailableListener
import androidx.annotation.CallSuper
import androidx.annotation.Nullable
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.internal.GeneratedComponentManager
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_HiddenTelegramActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\chat\ChatViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** ChatViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\chat\ChatViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** ChatViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\chat\ChatViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** ChatViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\Hilt_HomeActivity.java
**Imports:**
```
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.contextaware.OnContextAvailableListener
import androidx.annotation.CallSuper
import androidx.annotation.Nullable
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.android.internal.managers.SavedStateHandleHolder
import dagger.hilt.internal.GeneratedComponentManager
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts
import java.lang.Object
import java.lang.Override
```

**Classes:** to, via, Hilt_HomeActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\HomeActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.codegen.OriginatingElement
import dagger.hilt.internal.GeneratedEntryPoint
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\HomeActivity_MembersInjector.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.MembersInjector
import dagger.internal.DaggerGenerated
import dagger.internal.InjectedFieldSignature
import dagger.internal.QualifierMetadata
import javax.inject.Provider
```

**Classes:** HomeActivity_MembersInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\HomeViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** HomeViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\HomeViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** HomeViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\home\HomeViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** HomeViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\login\LoginViewModel_Factory.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
import javax.inject.Provider
```

**Classes:** LoginViewModel_Factory

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\login\LoginViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** LoginViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\login\LoginViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** LoginViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\splash\SplashViewModel_Factory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** SplashViewModel_Factory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\splash\SplashViewModel_HiltModules.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap
import dagger.hilt.codegen.OriginatingElement
import dagger.multibindings.IntoMap
import dagger.multibindings.LazyClassKey
```

**Classes:** SplashViewModel_HiltModules, BindsModule, KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\com\genius\tdlibandroid\presentation\splash\SplashViewModel_HiltModules_KeyModule_ProvideFactory.java
**Imports:**
```
import dagger.internal.DaggerGenerated
import dagger.internal.Factory
import dagger.internal.QualifierMetadata
import dagger.internal.ScopeMetadata
```

**Classes:** SplashViewModel_HiltModules_KeyModule_ProvideFactory, InstanceHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\dagger\hilt\internal\aggregatedroot\codegen\_com_genius_tdlibandroid_MyApp.java
**Imports:**
```
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.internal.aggregatedroot.AggregatedRoot
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_di_AppModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_di_AppModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_MyApp_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_MyApp_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\generated\source\kapt\release\hilt_aggregated_deps\_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java
**Imports:**
```
import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps
```

**Classes:** should, aggregates, _com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\Alarm.java
**Classes:** Alarm

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\AlarmAdapter.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.genius.tdlibandroid.Alarm
import com.genius.tdlibandroid.R
```

**Classes:** AlarmAdapter, AlarmViewHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\AlarmReceiver.java
**Imports:**
```
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import androidx.core.content.ContextCompat
```

**Classes:** AlarmReceiver

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\AlarmService.java
**Imports:**
```
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
```

**Classes:** AlarmService

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\MainActivity.java
**Imports:**
```
import android.Manifest
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
```

**Classes:** MainActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\MyApp.java
**Imports:**
```
import androidx.multidex.MultiDexApplication
import com.genius.tdlibandroid.data.TgCore
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
```

**Classes:** MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\core\TgBaseViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
```

**Classes:** TgBaseViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\core\TgUserAuthState.java
**Classes:** Authenticated, Closed, Init, InsertCode, InsertNumber, InsertPassword, Loading, LoggedOut, Unknown

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\AuthState.java
**Classes:** AuthState, Closed, Error, LoggingOut, Ready, Uninitialized, WaitCode, WaitPassword, WaitPhoneNumber, WaitTdlibParameters

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\TelegramClient.java
**Imports:**
```
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\TelegramClientImpl.java
**Imports:**
```
import android.content.Context
import android.os.Build
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TelegramClientImpl

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\TgCore.java
**Imports:**
```
import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgCore

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\TgValidationError.java
**Classes:** TgValidationError, PasswordError, PhoneNumberError

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\tgRepos\TgAuthRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgAuthRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\tgRepos\TgChatRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.Dispatchers
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgChatRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\data\tgRepos\TgUserRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgUserRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\di\AppModule.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.TelegramClientImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
```

**Classes:** AppModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\HiddenTelegramActivity.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\HiddenTelegramActivityKt.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivityKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\Screen.java
**Imports:**
```
import androidx.navigation.NavBackStackEntry
```

**Classes:** Screen, Chat, Home, Login, Splash

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\auth\AuthDebugActivity.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
```

**Classes:** AuthDebugActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\chat\ChatScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.lifecycle.Lifecycle
import org.drinkless.tdlib.TdApi
```

**Classes:** ChatScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\chat\ChatUiState.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatUiState

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\chat\ChatViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\home\HomeActivity.java
**Imports:**
```
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.genius.tdlibandroid.R
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HomeActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\home\HomeScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import org.drinkless.tdlib.TdApi
```

**Classes:** HomeScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\home\HomeViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** HomeViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\login\LoginScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.genius.tdlibandroid.data.AuthState
```

**Classes:** LoginScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\login\LoginStates.java
**Classes:** LoginStates, Authenticated, InsertCode, InsertNumber, InsertPassword, Loading, LoggedOut

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\login\LoginViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** LoginViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\navigation\AppNavGrapKt.java
**Imports:**
```
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import com.genius.tdlibandroid.presentation.home.HomeViewModel
```

**Classes:** AppNavGrapKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\navigation\NavRoutes.java
**Classes:** NavRoutes

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\splash\SplashScreenKt.java
**Imports:**
```
import androidx.compose.runtime.Composable
```

**Classes:** SplashScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\presentation\splash\SplashViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** SplashViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\ui\theme\ColorKt.java
**Classes:** ColorKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\ui\theme\ThemeKt.java
**Imports:**
```
import android.app.Activity
import android.os.Build
import androidx.compose.runtime.Composable
```

**Classes:** ThemeKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\com\genius\tdlibandroid\ui\theme\TypeKt.java
**Imports:**
```
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
```

**Classes:** TypeKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\debug\error\NonExistentClass.java
**Classes:** NonExistentClass

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\Alarm.java
**Classes:** Alarm

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\AlarmAdapter.java
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.genius.tdlibandroid.Alarm
import com.genius.tdlibandroid.R
```

**Classes:** AlarmAdapter, AlarmViewHolder

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\AlarmReceiver.java
**Imports:**
```
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import androidx.core.content.ContextCompat
```

**Classes:** AlarmReceiver

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\AlarmService.java
**Imports:**
```
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
```

**Classes:** AlarmService

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\MainActivity.java
**Imports:**
```
import android.Manifest
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
```

**Classes:** MainActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\MyApp.java
**Imports:**
```
import androidx.multidex.MultiDexApplication
import com.genius.tdlibandroid.data.TgCore
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
```

**Classes:** MyApp

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\core\TgBaseViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
```

**Classes:** TgBaseViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\core\TgUserAuthState.java
**Classes:** Authenticated, Closed, Init, InsertCode, InsertNumber, InsertPassword, Loading, LoggedOut, Unknown

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\AuthState.java
**Classes:** AuthState, Closed, Error, LoggingOut, Ready, Uninitialized, WaitCode, WaitPassword, WaitPhoneNumber, WaitTdlibParameters

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\TelegramClient.java
**Imports:**
```
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\TelegramClientImpl.java
**Imports:**
```
import android.content.Context
import android.os.Build
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TelegramClientImpl

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\TgCore.java
**Imports:**
```
import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgCore

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\TgValidationError.java
**Classes:** TgValidationError, PasswordError, PhoneNumberError

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\tgRepos\TgAuthRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgAuthRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\tgRepos\TgChatRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.Dispatchers
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgChatRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\data\tgRepos\TgUserRepository.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgUserRepository

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\di\AppModule.java
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.TelegramClientImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
```

**Classes:** AppModule

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\HiddenTelegramActivity.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\HiddenTelegramActivityKt.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivityKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\Screen.java
**Imports:**
```
import androidx.navigation.NavBackStackEntry
```

**Classes:** Screen, Chat, Home, Login, Splash

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\auth\AuthDebugActivity.java
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
```

**Classes:** AuthDebugActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\chat\ChatScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.lifecycle.Lifecycle
import org.drinkless.tdlib.TdApi
```

**Classes:** ChatScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\chat\ChatUiState.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatUiState

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\chat\ChatViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\home\HomeActivity.java
**Imports:**
```
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.genius.tdlibandroid.R
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HomeActivity

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\home\HomeScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import org.drinkless.tdlib.TdApi
```

**Classes:** HomeScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\home\HomeViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** HomeViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\login\LoginScreenKt.java
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.genius.tdlibandroid.data.AuthState
```

**Classes:** LoginScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\login\LoginStates.java
**Classes:** LoginStates, Authenticated, InsertCode, InsertNumber, InsertPassword, Loading, LoggedOut

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\login\LoginViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** LoginViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\navigation\AppNavGrapKt.java
**Imports:**
```
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import com.genius.tdlibandroid.presentation.home.HomeViewModel
```

**Classes:** AppNavGrapKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\navigation\NavRoutes.java
**Classes:** NavRoutes

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\splash\SplashScreenKt.java
**Imports:**
```
import androidx.compose.runtime.Composable
```

**Classes:** SplashScreenKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\presentation\splash\SplashViewModel.java
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** SplashViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\ui\theme\ColorKt.java
**Classes:** ColorKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\ui\theme\ThemeKt.java
**Imports:**
```
import android.app.Activity
import android.os.Build
import androidx.compose.runtime.Composable
```

**Classes:** ThemeKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\com\genius\tdlibandroid\ui\theme\TypeKt.java
**Imports:**
```
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
```

**Classes:** TypeKt

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\build\tmp\kapt3\stubs\release\error\NonExistentClass.java
**Classes:** NonExistentClass

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\androidTest\java\com\genius\tdlibandroid\ExampleInstrumentedTest.kt
**Imports:**
```
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
```

**Classes:** ExampleInstrumentedTest

**Functions:** useAppContext

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\Alarm.kt
**Classes:** Alarm

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\AlarmAdapter.kt
**Imports:**
```
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.genius.tdlibandroid.Alarm
import com.genius.tdlibandroid.R
```

**Classes:** AlarmAdapter, AlarmViewHolder

**Functions:** onItemClick, onSwitchToggle, onCreateViewHolder, onBindViewHolder, getItemCount

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\AlarmReceiver.kt
**Imports:**
```
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import androidx.core.content.ContextCompat
```

**Classes:** AlarmReceiver

**Functions:** onReceive

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\AlarmService.kt
**Imports:**
```
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
```

**Classes:** AlarmService

**Functions:** onBind, onStartCommand, playAlarmSound, buildNotification, createChannelIfNeeded, onDestroy

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\MainActivity.kt
**Imports:**
```
import android.Manifest
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.genius.tdlibandroid.presentation.HiddenTelegramActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
```

**Classes:** MainActivity

**Functions:** onCreate, checkAndRequestExactAlarmPermission, askForNotificationPermission, setupRecyclerView, showAlarmDialog, scheduleNormalAlarm, scheduleAlarm, cancelAlarm, onItemClick, onSwitchToggle

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\MyApp.kt
**Imports:**
```
import androidx.multidex.MultiDexApplication
import com.genius.tdlibandroid.data.TgCore
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
```

**Classes:** MyApp

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\core\TgBaseViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
```

**Classes:** TgBaseViewModel

**Functions:** getAuthStatus

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\core\TgUserAuthState.kt
## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\AuthState.kt
**Classes:** AuthState, Error

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\TelegramClient.kt
**Imports:**
```
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi
```

**Functions:** send, setPhoneNumber, checkCode, checkPassword, logOut, getMe, getChats, getChat, searchChats, openChat, closeChat, getChatHistory, getMessage, viewMessages, sendTyping, sendTextMessage, editMessageText, deleteMessages, downloadFile, getFile

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\TelegramClientImpl.kt
**Imports:**
```
import android.content.Context
import android.os.Build
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
```

**Classes:** TelegramClientImpl

**Functions:** handleAuthorizationState, setupTdlibParameters, send, setPhoneNumber, checkCode, checkPassword, logOut, getMe, getChats, getChat, openChat, closeChat, getChatHistory, getMessage, viewMessages, sendTyping, sendTextMessage, searchChats, editMessageText, deleteMessages, downloadFile, getFile

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\TgCore.kt
**Imports:**
```
import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgCore

**Functions:** initialize, setPhone

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\TgErrors.kt
**Classes:** TgValidationError

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\tgRepos\TgAuthRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgAuthRepository

**Functions:** setPhoneNumber, checkCode, checkPassword, logOut

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\tgRepos\TgChatRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgChatRepository

**Functions:** openChat, closeChat, getHistory, sendText, markRead, sendTyping, getMessage

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\data\tgRepos\TgUserRepository.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
import javax.inject.Singleton
```

**Classes:** TgUserRepository

**Functions:** getMe, getChats, getChat

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\di\AppModule.kt
**Imports:**
```
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.TelegramClientImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
```

**Classes:** AppModule

**Functions:** bindTelegramClient

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\HiddenTelegramActivity.kt
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.genius.tdlibandroid.data.AuthState
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.presentation.login.LoginScreen
import com.genius.tdlibandroid.presentation.navigation.AppNavGraph
import com.genius.tdlibandroid.presentation.navigation.NavRoutes
import com.genius.tdlibandroid.ui.theme.TDLibAndroidTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
```

**Classes:** HiddenTelegramActivity

**Functions:** onCreate, App

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\Screen.kt
**Imports:**
```
import androidx.navigation.NavBackStackEntry
```

**Classes:** Screen

**Functions:** buildRoute, getChatId

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\auth\AuthDebugActivity.kt
**Imports:**
```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
```

**Classes:** AuthDebugActivity

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\chat\ChatScreen.kt
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import org.drinkless.tdlib.TdApi
```

**Functions:** ChatScreen, MessageBubble

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\chat\ChatViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** ChatUiState, ChatViewModel

**Functions:** init, startUpdates, onInputChange, sendMessage, onCleared

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\home\HomeActivity.kt
**Imports:**
```
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.genius.tdlibandroid.R
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject
```

**Classes:** HomeActivity

**Functions:** onCreate

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\home\HomeScreen.kt
**Imports:**
```
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.drinkless.tdlib.TdApi
```

**Functions:** HomeScreen, ChatItem

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\home\HomeViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import javax.inject.Inject
```

**Classes:** HomeViewModel

**Functions:** loadChats

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\login\LoginScreen.kt
**Imports:**
```
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.genius.tdlibandroid.data.AuthState
```

**Functions:** LoginScreen

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\login\LoginStates.kt
**Classes:** LoginStates, InsertNumber, InsertCode, InsertPassword

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\login\LoginViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
```

**Classes:** LoginViewModel

**Functions:** sendPhoneNumber, sendCode, sendPassword

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\navigation\AppNavGrap.kt
**Imports:**
```
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.genius.tdlibandroid.presentation.chat.ChatScreen
import com.genius.tdlibandroid.presentation.home.HomeScreen
import com.genius.tdlibandroid.presentation.home.HomeViewModel
```

**Functions:** AppNavGraph

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\navigation\NavRoutes.kt
**Functions:** chat

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\splash\SplashScreen.kt
**Imports:**
```
import androidx.compose.runtime.Composable
```

**Functions:** SplashScreen

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\presentation\splash\SplashViewModel.kt
**Imports:**
```
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
```

**Classes:** SplashViewModel

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\ui\theme\Color.kt
**Imports:**
```
import androidx.compose.ui.graphics.Color
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\ui\theme\Theme.kt
**Imports:**
```
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
```

**Functions:** TDLibAndroidTheme

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\com\genius\tdlibandroid\ui\theme\Type.kt
**Imports:**
```
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
```

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\org\drinkless\tdlib\Client.java
**Imports:**
```
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
```

**Classes:** for, Client, thrown, ExecutionException, ResponseReceiver, Handler

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\main\java\org\drinkless\tdlib\TdApi.java
**Imports:**
```
import androidx.annotation.IntDef
import androidx.annotation.Nullable
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import or
import or
```

**Classes:** contains, TdApi, is, for, Object, is, for, Function, AccentColor, AccountTtl, AddedReaction, AddedReactions, Address, AnimatedChatPhoto, AnimatedEmoji, Animation, Animations, ArchiveChatListSettings, AttachmentMenuBot, AttachmentMenuBotColor, Audio, AuthenticationCodeInfo, is, AuthenticationCodeType, constructor, AuthenticationCodeTypeTelegramMessage, AuthenticationCodeTypeSms, AuthenticationCodeTypeSmsWord, AuthenticationCodeTypeSmsPhrase, AuthenticationCodeTypeCall, AuthenticationCodeTypeFlashCall, AuthenticationCodeTypeMissedCall, AuthenticationCodeTypeFragment, AuthenticationCodeTypeFirebaseAndroid, AuthenticationCodeTypeFirebaseIos, is, AuthorizationState, constructor, AuthorizationStateWaitTdlibParameters, AuthorizationStateWaitPhoneNumber, AuthorizationStateWaitEmailAddress, AuthorizationStateWaitEmailCode, AuthorizationStateWaitCode, AuthorizationStateWaitOtherDeviceConfirmation, AuthorizationStateWaitRegistration, AuthorizationStateWaitPassword, AuthorizationStateReady, AuthorizationStateLoggingOut, AuthorizationStateClosing, AuthorizationStateClosed, AutoDownloadSettings, AutoDownloadSettingsPresets, AutosaveSettings, AutosaveSettingsException, is, AutosaveSettingsScope, constructor, AutosaveSettingsScopePrivateChats, AutosaveSettingsScopeGroupChats, AutosaveSettingsScopeChannelChats, AutosaveSettingsScopeChat, AvailableReaction, AvailableReactions, Background, is, BackgroundFill, constructor, BackgroundFillSolid, BackgroundFillGradient, BackgroundFillFreeformGradient, is, BackgroundType, constructor, BackgroundTypeWallpaper, BackgroundTypePattern, BackgroundTypeFill, BackgroundTypeChatTheme, Backgrounds, BankCardActionOpenUrl, BankCardInfo, BasicGroup, BasicGroupFullInfo, Birthdate, is, BlockList, constructor, BlockListMain, BlockListStories, BotCommand, is, BotCommandScope, constructor, BotCommandScopeDefault, BotCommandScopeAllPrivateChats, BotCommandScopeAllGroupChats, BotCommandScopeAllChatAdministrators, BotCommandScopeChat, BotCommandScopeChatAdministrators, BotCommandScopeChatMember, BotCommands, BotInfo, BotMediaPreview, BotMediaPreviewInfo, BotMediaPreviews, BotMenuButton, is, BotTransactionPurpose, constructor, BotTransactionPurposePaidMedia, BotTransactionPurposeInvoicePayment, is, BotWriteAccessAllowReason, constructor, BotWriteAccessAllowReasonConnectedWebsite, BotWriteAccessAllowReasonAddedToAttachmentMenu, BotWriteAccessAllowReasonLaunchedWebApp, BotWriteAccessAllowReasonAcceptedRequest, is, BusinessAwayMessageSchedule, constructor, BusinessAwayMessageScheduleAlways, BusinessAwayMessageScheduleOutsideOfOpeningHours, BusinessAwayMessageScheduleCustom, BusinessAwayMessageSettings, BusinessBotManageBar, BusinessChatLink, BusinessChatLinkInfo, BusinessChatLinks, BusinessConnectedBot, BusinessConnection, is, BusinessFeature, constructor, BusinessFeatureLocation, BusinessFeatureOpeningHours, BusinessFeatureQuickReplies, BusinessFeatureGreetingMessage, BusinessFeatureAwayMessage, BusinessFeatureAccountLinks, BusinessFeatureStartPage, BusinessFeatureBots, BusinessFeatureEmojiStatus, BusinessFeatureChatFolderTags, BusinessFeatureUpgradedStories, BusinessFeaturePromotionAnimation, BusinessFeatures, BusinessGreetingMessageSettings, BusinessInfo, BusinessLocation, BusinessMessage, BusinessMessages, BusinessOpeningHours, BusinessOpeningHoursInterval, BusinessRecipients, BusinessStartPage, Call, is, CallDiscardReason, constructor, CallDiscardReasonEmpty, CallDiscardReasonMissed, CallDiscardReasonDeclined, CallDiscardReasonDisconnected, CallDiscardReasonHungUp, CallId, is, CallProblem, constructor, CallProblemEcho, CallProblemNoise, CallProblemInterruptions, CallProblemDistortedSpeech, CallProblemSilentLocal, CallProblemSilentRemote, CallProblemDropped, CallProblemDistortedVideo, CallProblemPixelatedVideo, CallProtocol, CallServer, is, CallServerType, constructor, CallServerTypeTelegramReflector, CallServerTypeWebrtc, is, CallState, constructor, CallStatePending, CallStateExchangingKeys, CallStateReady, CallStateHangingUp, CallStateDiscarded, CallStateError, CallbackQueryAnswer, is, CallbackQueryPayload, constructor, CallbackQueryPayloadData, CallbackQueryPayloadDataWithPassword, CallbackQueryPayloadGame, is, CanSendMessageToUserResult, constructor, CanSendMessageToUserResultOk, CanSendMessageToUserResultUserIsDeleted, CanSendMessageToUserResultUserRestrictsNewChats, is, CanSendStoryResult, constructor, CanSendStoryResultOk, CanSendStoryResultPremiumNeeded, CanSendStoryResultBoostNeeded, CanSendStoryResultActiveStoryLimitExceeded, CanSendStoryResultWeeklyLimitExceeded, CanSendStoryResultMonthlyLimitExceeded, is, CanTransferOwnershipResult, constructor, CanTransferOwnershipResultOk, CanTransferOwnershipResultPasswordNeeded, CanTransferOwnershipResultPasswordTooFresh, CanTransferOwnershipResultSessionTooFresh, is, ChannelTransactionPurpose, constructor, ChannelTransactionPurposePaidMedia, ChannelTransactionPurposeJoin, ChannelTransactionPurposeReaction, Chat, is, ChatAction, constructor, ChatActionTyping, ChatActionRecordingVideo, ChatActionUploadingVideo, ChatActionRecordingVoiceNote, ChatActionUploadingVoiceNote, ChatActionUploadingPhoto, ChatActionUploadingDocument, ChatActionChoosingSticker, ChatActionChoosingLocation, ChatActionChoosingContact, ChatActionStartPlayingGame, ChatActionRecordingVideoNote, ChatActionUploadingVideoNote, ChatActionWatchingAnimations, ChatActionCancel, is, ChatActionBar, constructor, ChatActionBarReportSpam, ChatActionBarReportUnrelatedLocation, ChatActionBarInviteMembers, ChatActionBarReportAddBlock, ChatActionBarAddContact, ChatActionBarSharePhoneNumber, ChatActionBarJoinRequest, ChatActiveStories, ChatAdministrator, ChatAdministratorRights, ChatAdministrators, is, ChatAvailableReactions, constructor, ChatAvailableReactionsAll, ChatAvailableReactionsSome, ChatBackground, ChatBoost, ChatBoostFeatures, ChatBoostLevelFeatures, ChatBoostLink, ChatBoostLinkInfo, ChatBoostSlot, ChatBoostSlots, is, ChatBoostSource, constructor, ChatBoostSourceGiftCode, ChatBoostSourceGiveaway, ChatBoostSourcePremium, ChatBoostStatus, ChatEvent, is, ChatEventAction, constructor, ChatEventMessageEdited, ChatEventMessageDeleted, ChatEventMessagePinned, ChatEventMessageUnpinned, ChatEventPollStopped, ChatEventMemberJoined, ChatEventMemberJoinedByInviteLink, ChatEventMemberJoinedByRequest, ChatEventMemberInvited, ChatEventMemberLeft, ChatEventMemberPromoted, ChatEventMemberRestricted, ChatEventAvailableReactionsChanged, ChatEventBackgroundChanged, ChatEventDescriptionChanged, ChatEventEmojiStatusChanged, ChatEventLinkedChatChanged, ChatEventLocationChanged, ChatEventMessageAutoDeleteTimeChanged, ChatEventPermissionsChanged, ChatEventPhotoChanged, ChatEventSlowModeDelayChanged, ChatEventStickerSetChanged, ChatEventCustomEmojiStickerSetChanged, ChatEventTitleChanged, ChatEventUsernameChanged, ChatEventActiveUsernamesChanged, ChatEventAccentColorChanged, ChatEventProfileAccentColorChanged, ChatEventHasProtectedContentToggled, ChatEventInvitesToggled, ChatEventIsAllHistoryAvailableToggled, ChatEventHasAggressiveAntiSpamEnabledToggled, ChatEventSignMessagesToggled, ChatEventShowMessageSenderToggled, ChatEventInviteLinkEdited, ChatEventInviteLinkRevoked, ChatEventInviteLinkDeleted, ChatEventVideoChatCreated, ChatEventVideoChatEnded, ChatEventVideoChatMuteNewParticipantsToggled, ChatEventVideoChatParticipantIsMutedToggled, ChatEventVideoChatParticipantVolumeLevelChanged, ChatEventIsForumToggled, ChatEventForumTopicCreated, ChatEventForumTopicEdited, ChatEventForumTopicToggleIsClosed, ChatEventForumTopicToggleIsHidden, ChatEventForumTopicDeleted, ChatEventForumTopicPinned, ChatEventLogFilters, ChatEvents, ChatFolder, ChatFolderIcon, ChatFolderInfo, ChatFolderInviteLink, ChatFolderInviteLinkInfo, ChatFolderInviteLinks, ChatInviteLink, ChatInviteLinkCount, ChatInviteLinkCounts, ChatInviteLinkInfo, ChatInviteLinkMember, ChatInviteLinkMembers, ChatInviteLinkSubscriptionInfo, ChatInviteLinks, ChatJoinRequest, ChatJoinRequests, ChatJoinRequestsInfo, is, ChatList, constructor, ChatListMain, ChatListArchive, ChatListFolder, ChatLists, ChatLocation, ChatMember, is, ChatMemberStatus, constructor, ChatMemberStatusCreator, ChatMemberStatusAdministrator, ChatMemberStatusMember, ChatMemberStatusRestricted, ChatMemberStatusLeft, ChatMemberStatusBanned, ChatMembers, is, ChatMembersFilter, constructor, ChatMembersFilterContacts, ChatMembersFilterAdministrators, ChatMembersFilterMembers, ChatMembersFilterMention, ChatMembersFilterRestricted, ChatMembersFilterBanned, ChatMembersFilterBots, ChatMessageSender, ChatMessageSenders, ChatNearby, ChatNotificationSettings, ChatPermissions, ChatPhoto, ChatPhotoInfo, ChatPhotoSticker, is, ChatPhotoStickerType, constructor, ChatPhotoStickerTypeRegularOrMask, ChatPhotoStickerTypeCustomEmoji, ChatPhotos, ChatPosition, ChatRevenueAmount, ChatRevenueStatistics, ChatRevenueTransaction, is, ChatRevenueTransactionType, constructor, ChatRevenueTransactionTypeEarnings, ChatRevenueTransactionTypeWithdrawal, ChatRevenueTransactionTypeRefund, ChatRevenueTransactions, is, ChatSource, constructor, ChatSourceMtprotoProxy, ChatSourcePublicServiceAnnouncement, is, ChatStatistics, constructor, ChatStatisticsSupergroup, ChatStatisticsChannel, ChatStatisticsAdministratorActionsInfo, ChatStatisticsInteractionInfo, ChatStatisticsInviterInfo, ChatStatisticsMessageSenderInfo, is, ChatStatisticsObjectType, constructor, ChatStatisticsObjectTypeMessage, ChatStatisticsObjectTypeStory, ChatTheme, is, ChatType, constructor, ChatTypePrivate, ChatTypeBasicGroup, ChatTypeSupergroup, ChatTypeSecret, Chats, ChatsNearby, is, CheckChatUsernameResult, constructor, CheckChatUsernameResultOk, CheckChatUsernameResultUsernameInvalid, CheckChatUsernameResultUsernameOccupied, CheckChatUsernameResultUsernamePurchasable, CheckChatUsernameResultPublicChatsTooMany, CheckChatUsernameResultPublicGroupsUnavailable, is, CheckStickerSetNameResult, constructor, CheckStickerSetNameResultOk, CheckStickerSetNameResultNameInvalid, CheckStickerSetNameResultNameOccupied, CloseBirthdayUser, ClosedVectorPath, CollectibleItemInfo, is, CollectibleItemType, constructor, CollectibleItemTypeUsername, CollectibleItemTypePhoneNumber, ConnectedWebsite, ConnectedWebsites, is, ConnectionState, constructor, ConnectionStateWaitingForNetwork, ConnectionStateConnectingToProxy, ConnectionStateConnecting, ConnectionStateUpdating, ConnectionStateReady, Contact, Count, Countries, CountryInfo, CreatedBasicGroupChat, CurrentWeather, CustomRequestResult, DatabaseStatistics, Date, DateRange, DatedFile, DeepLinkInfo, is, DeviceToken, constructor, DeviceTokenFirebaseCloudMessaging, DeviceTokenApplePush, DeviceTokenApplePushVoIP, DeviceTokenWindowsPush, DeviceTokenMicrosoftPush, DeviceTokenMicrosoftPushVoIP, DeviceTokenWebPush, DeviceTokenSimplePush, DeviceTokenUbuntuPush, DeviceTokenBlackBerryPush, DeviceTokenTizenPush, DeviceTokenHuaweiPush, is, DiceStickers, constructor, DiceStickersRegular, DiceStickersSlotMachine, Document, DownloadedFileCounts, DraftMessage, is, EmailAddressAuthentication, constructor, EmailAddressAuthenticationCode, EmailAddressAuthenticationAppleId, EmailAddressAuthenticationGoogleId, EmailAddressAuthenticationCodeInfo, is, EmailAddressResetState, constructor, EmailAddressResetStateAvailable, EmailAddressResetStatePending, EmojiCategories, EmojiCategory, is, EmojiCategorySource, constructor, EmojiCategorySourceSearch, EmojiCategorySourcePremium, is, EmojiCategoryType, constructor, EmojiCategoryTypeDefault, EmojiCategoryTypeRegularStickers, EmojiCategoryTypeEmojiStatus, EmojiCategoryTypeChatPhoto, EmojiKeyword, EmojiKeywords, EmojiReaction, EmojiStatus, EmojiStatuses, Emojis, EncryptedCredentials, EncryptedPassportElement, Error, FactCheck, FailedToAddMember, FailedToAddMembers, File, FileDownload, FileDownloadedPrefixSize, FilePart, is, FileType, constructor, FileTypeNone, FileTypeAnimation, FileTypeAudio, FileTypeDocument, FileTypeNotificationSound, FileTypePhoto, FileTypePhotoStory, FileTypeProfilePhoto, FileTypeSecret, FileTypeSecretThumbnail, FileTypeSecure, FileTypeSticker, FileTypeThumbnail, FileTypeUnknown, FileTypeVideo, FileTypeVideoNote, FileTypeVideoStory, FileTypeVoiceNote, FileTypeWallpaper, is, FirebaseAuthenticationSettings, constructor, FirebaseAuthenticationSettingsAndroid, FirebaseAuthenticationSettingsIos, is, FirebaseDeviceVerificationParameters, constructor, FirebaseDeviceVerificationParametersSafetyNet, FirebaseDeviceVerificationParametersPlayIntegrity, FormattedText, ForumTopic, ForumTopicIcon, ForumTopicInfo, ForumTopics, ForwardSource, FoundChatBoosts, FoundChatMessages, FoundFileDownloads, FoundMessages, FoundPosition, FoundPositions, FoundStories, FoundUsers, FoundWebApp, Game, GameHighScore, GameHighScores, GroupCall, GroupCallId, GroupCallParticipant, GroupCallParticipantVideoInfo, GroupCallRecentSpeaker, GroupCallStream, GroupCallStreams, is, GroupCallVideoQuality, constructor, GroupCallVideoQualityThumbnail, GroupCallVideoQualityMedium, GroupCallVideoQualityFull, GroupCallVideoSourceGroup, Hashtags, HttpUrl, IdentityDocument, ImportedContacts, InlineKeyboardButton, is, InlineKeyboardButtonType, constructor, InlineKeyboardButtonTypeUrl, InlineKeyboardButtonTypeLoginUrl, InlineKeyboardButtonTypeWebApp, InlineKeyboardButtonTypeCallback, InlineKeyboardButtonTypeCallbackWithPassword, InlineKeyboardButtonTypeCallbackGame, InlineKeyboardButtonTypeSwitchInline, InlineKeyboardButtonTypeBuy, InlineKeyboardButtonTypeUser, is, InlineQueryResult, constructor, InlineQueryResultArticle, InlineQueryResultContact, InlineQueryResultLocation, InlineQueryResultVenue, InlineQueryResultGame, InlineQueryResultAnimation, InlineQueryResultAudio, InlineQueryResultDocument, InlineQueryResultPhoto, InlineQueryResultSticker, InlineQueryResultVideo, InlineQueryResultVoiceNote, InlineQueryResults, InlineQueryResultsButton, is, InlineQueryResultsButtonType, constructor, InlineQueryResultsButtonTypeStartBot, InlineQueryResultsButtonTypeWebApp, is, InputBackground, constructor, InputBackgroundLocal, InputBackgroundRemote, InputBackgroundPrevious, InputBusinessChatLink, InputBusinessStartPage, is, InputChatPhoto, constructor, InputChatPhotoPrevious, InputChatPhotoStatic, InputChatPhotoAnimation, InputChatPhotoSticker, is, InputCredentials, constructor, InputCredentialsSaved, InputCredentialsNew, InputCredentialsApplePay, InputCredentialsGooglePay, is, InputFile, constructor, InputFileId, InputFileRemote, InputFileLocal, InputFileGenerated, InputIdentityDocument, is, InputInlineQueryResult, constructor, InputInlineQueryResultAnimation, InputInlineQueryResultArticle, InputInlineQueryResultAudio, InputInlineQueryResultContact, InputInlineQueryResultDocument, InputInlineQueryResultGame, InputInlineQueryResultLocation, InputInlineQueryResultPhoto, InputInlineQueryResultSticker, InputInlineQueryResultVenue, InputInlineQueryResultVideo, InputInlineQueryResultVoiceNote, is, InputInvoice, constructor, InputInvoiceMessage, InputInvoiceName, InputInvoiceTelegram, is, InputMessageContent, constructor, InputMessageText, InputMessageAnimation, InputMessageAudio, InputMessageDocument, InputMessagePaidMedia, InputMessagePhoto, InputMessageSticker, InputMessageVideo, InputMessageVideoNote, InputMessageVoiceNote, InputMessageLocation, InputMessageVenue, InputMessageContact, InputMessageDice, InputMessageGame, InputMessageInvoice, InputMessagePoll, InputMessageStory, InputMessageForwarded, is, InputMessageReplyTo, constructor, InputMessageReplyToMessage, InputMessageReplyToExternalMessage, InputMessageReplyToStory, InputPaidMedia, is, InputPaidMediaType, constructor, InputPaidMediaTypePhoto, InputPaidMediaTypeVideo, is, InputPassportElement, constructor, InputPassportElementPersonalDetails, InputPassportElementPassport, InputPassportElementDriverLicense, InputPassportElementIdentityCard, InputPassportElementInternalPassport, InputPassportElementAddress, InputPassportElementUtilityBill, InputPassportElementBankStatement, InputPassportElementRentalAgreement, InputPassportElementPassportRegistration, InputPassportElementTemporaryRegistration, InputPassportElementPhoneNumber, InputPassportElementEmailAddress, InputPassportElementError, is, InputPassportElementErrorSource, constructor, InputPassportElementErrorSourceUnspecified, InputPassportElementErrorSourceDataField, InputPassportElementErrorSourceFrontSide, InputPassportElementErrorSourceReverseSide, InputPassportElementErrorSourceSelfie, InputPassportElementErrorSourceTranslationFile, InputPassportElementErrorSourceTranslationFiles, InputPassportElementErrorSourceFile, InputPassportElementErrorSourceFiles, InputPersonalDocument, InputSticker, InputStoryArea, is, InputStoryAreaType, constructor, InputStoryAreaTypeLocation, InputStoryAreaTypeFoundVenue, InputStoryAreaTypePreviousVenue, InputStoryAreaTypeSuggestedReaction, InputStoryAreaTypeMessage, InputStoryAreaTypeLink, InputStoryAreaTypeWeather, InputStoryAreas, is, InputStoryContent, constructor, InputStoryContentPhoto, InputStoryContentVideo, InputTextQuote, InputThumbnail, is, InternalLinkType, constructor, InternalLinkTypeActiveSessions, InternalLinkTypeAttachmentMenuBot, InternalLinkTypeAuthenticationCode, InternalLinkTypeBackground, InternalLinkTypeBotAddToChannel, InternalLinkTypeBotStart, InternalLinkTypeBotStartInGroup, InternalLinkTypeBusinessChat, InternalLinkTypeBuyStars, InternalLinkTypeChangePhoneNumber, InternalLinkTypeChatBoost, InternalLinkTypeChatFolderInvite, InternalLinkTypeChatFolderSettings, InternalLinkTypeChatInvite, InternalLinkTypeDefaultMessageAutoDeleteTimerSettings, InternalLinkTypeEditProfileSettings, InternalLinkTypeGame, InternalLinkTypeInstantView, InternalLinkTypeInvoice, InternalLinkTypeLanguagePack, InternalLinkTypeLanguageSettings, InternalLinkTypeMainWebApp, InternalLinkTypeMessage, InternalLinkTypeMessageDraft, InternalLinkTypePassportDataRequest, InternalLinkTypePhoneNumberConfirmation, InternalLinkTypePremiumFeatures, InternalLinkTypePremiumGift, InternalLinkTypePremiumGiftCode, InternalLinkTypePrivacyAndSecuritySettings, InternalLinkTypeProxy, InternalLinkTypePublicChat, InternalLinkTypeQrCodeAuthentication, InternalLinkTypeRestorePurchases, InternalLinkTypeSettings, InternalLinkTypeStickerSet, InternalLinkTypeStory, InternalLinkTypeTheme, InternalLinkTypeThemeSettings, InternalLinkTypeUnknownDeepLink, InternalLinkTypeUnsupportedProxy, InternalLinkTypeUserPhoneNumber, InternalLinkTypeUserToken, InternalLinkTypeVideoChat, InternalLinkTypeWebApp, is, InviteLinkChatType, constructor, InviteLinkChatTypeBasicGroup, InviteLinkChatTypeSupergroup, InviteLinkChatTypeChannel, Invoice, JsonObjectMember, is, JsonValue, constructor, JsonValueNull, JsonValueBoolean, JsonValueNumber, JsonValueString, JsonValueArray, JsonValueObject, KeyboardButton, is, KeyboardButtonType, constructor, KeyboardButtonTypeText, KeyboardButtonTypeRequestPhoneNumber, KeyboardButtonTypeRequestLocation, KeyboardButtonTypeRequestPoll, KeyboardButtonTypeRequestUsers, KeyboardButtonTypeRequestChat, KeyboardButtonTypeWebApp, LabeledPricePart, LanguagePackInfo, LanguagePackString, is, LanguagePackStringValue, constructor, LanguagePackStringValueOrdinary, LanguagePackStringValuePluralized, LanguagePackStringValueDeleted, LanguagePackStrings, LinkPreview, is, LinkPreviewAlbumMedia, constructor, LinkPreviewAlbumMediaPhoto, LinkPreviewAlbumMediaVideo, LinkPreviewOptions, is, LinkPreviewType, constructor, LinkPreviewTypeAlbum, LinkPreviewTypeAnimation, LinkPreviewTypeApp, LinkPreviewTypeArticle, LinkPreviewTypeAudio, LinkPreviewTypeBackground, LinkPreviewTypeChannelBoost, LinkPreviewTypeChat, LinkPreviewTypeDocument, LinkPreviewTypeEmbeddedAnimationPlayer, LinkPreviewTypeEmbeddedAudioPlayer, LinkPreviewTypeEmbeddedVideoPlayer, LinkPreviewTypeInvoice, LinkPreviewTypeMessage, LinkPreviewTypePhoto, LinkPreviewTypePremiumGiftCode, LinkPreviewTypeShareableChatFolder, LinkPreviewTypeSticker, LinkPreviewTypeStickerSet, LinkPreviewTypeStory, LinkPreviewTypeSupergroupBoost, LinkPreviewTypeTheme, LinkPreviewTypeUnsupported, LinkPreviewTypeUser, LinkPreviewTypeVideo, LinkPreviewTypeVideoChat, LinkPreviewTypeVideoNote, LinkPreviewTypeVoiceNote, LinkPreviewTypeWebApp, LocalFile, LocalizationTargetInfo, Location, LocationAddress, is, LogStream, constructor, LogStreamDefault, LogStreamFile, LogStreamEmpty, LogTags, LogVerbosityLevel, is, LoginUrlInfo, constructor, LoginUrlInfoOpen, LoginUrlInfoRequestConfirmation, MainWebApp, is, MaskPoint, constructor, MaskPointForehead, MaskPointEyes, MaskPointMouth, MaskPointChin, MaskPosition, Message, MessageAutoDeleteTime, MessageCalendar, MessageCalendarDay, is, MessageContent, constructor, MessageText, MessageAnimation, MessageAudio, MessageDocument, MessagePaidMedia, MessagePhoto, MessageSticker, MessageVideo, MessageVideoNote, MessageVoiceNote, MessageExpiredPhoto, MessageExpiredVideo, MessageExpiredVideoNote, MessageExpiredVoiceNote, MessageLocation, MessageVenue, MessageContact, MessageAnimatedEmoji, MessageDice, MessageGame, MessagePoll, MessageStory, MessageInvoice, MessageCall, MessageVideoChatScheduled, MessageVideoChatStarted, MessageVideoChatEnded, MessageInviteVideoChatParticipants, MessageBasicGroupChatCreate, MessageSupergroupChatCreate, MessageChatChangeTitle, MessageChatChangePhoto, MessageChatDeletePhoto, MessageChatAddMembers, MessageChatJoinByLink, MessageChatJoinByRequest, MessageChatDeleteMember, MessageChatUpgradeTo, MessageChatUpgradeFrom, MessagePinMessage, MessageScreenshotTaken, MessageChatSetBackground, MessageChatSetTheme, MessageChatSetMessageAutoDeleteTime, MessageChatBoost, MessageForumTopicCreated, MessageForumTopicEdited, MessageForumTopicIsClosedToggled, MessageForumTopicIsHiddenToggled, MessageSuggestProfilePhoto, MessageCustomServiceAction, MessageGameScore, MessagePaymentSuccessful, MessagePaymentSuccessfulBot, MessagePaymentRefunded, MessageGiftedPremium, MessagePremiumGiftCode, MessagePremiumGiveawayCreated, MessagePremiumGiveaway, MessagePremiumGiveawayCompleted, MessagePremiumGiveawayWinners, MessageGiftedStars, MessageContactRegistered, MessageUsersShared, MessageChatShared, MessageBotWriteAccessAllowed, MessageWebAppDataSent, MessageWebAppDataReceived, MessagePassportDataSent, MessagePassportDataReceived, MessageProximityAlertTriggered, MessageUnsupported, MessageCopyOptions, MessageEffect, is, MessageEffectType, constructor, MessageEffectTypeEmojiReaction, MessageEffectTypePremiumSticker, is, MessageFileType, constructor, MessageFileTypePrivate, MessageFileTypeGroup, MessageFileTypeUnknown, MessageForwardInfo, MessageImportInfo, MessageInteractionInfo, MessageLink, MessageLinkInfo, is, MessageOrigin, constructor, MessageOriginUser, MessageOriginHiddenUser, MessageOriginChat, MessageOriginChannel, MessagePosition, MessagePositions, MessageProperties, MessageReaction, MessageReactions, is, MessageReadDate, constructor, MessageReadDateRead, MessageReadDateUnread, MessageReadDateTooOld, MessageReadDateUserPrivacyRestricted, MessageReadDateMyPrivacyRestricted, MessageReplyInfo, is, MessageReplyTo, constructor, MessageReplyToMessage, MessageReplyToStory, is, MessageSchedulingState, constructor, MessageSchedulingStateSendAtDate, MessageSchedulingStateSendWhenOnline, is, MessageSelfDestructType, constructor, MessageSelfDestructTypeTimer, MessageSelfDestructTypeImmediately, MessageSendOptions, is, MessageSender, constructor, MessageSenderUser, MessageSenderChat, MessageSenders, is, MessageSendingState, constructor, MessageSendingStatePending, MessageSendingStateFailed, is, MessageSource, constructor, MessageSourceChatHistory, MessageSourceMessageThreadHistory, MessageSourceForumTopicHistory, MessageSourceHistoryPreview, MessageSourceChatList, MessageSourceSearch, MessageSourceChatEventLog, MessageSourceNotification, MessageSourceScreenshot, MessageSourceOther, MessageSponsor, MessageStatistics, MessageThreadInfo, MessageViewer, MessageViewers, Messages, Minithumbnail, NetworkStatistics, is, NetworkStatisticsEntry, constructor, NetworkStatisticsEntryFile, NetworkStatisticsEntryCall, is, NetworkType, constructor, NetworkTypeNone, NetworkTypeMobile, NetworkTypeMobileRoaming, NetworkTypeWiFi, NetworkTypeOther, NewChatPrivacySettings, Notification, NotificationGroup, is, NotificationGroupType, constructor, NotificationGroupTypeMessages, NotificationGroupTypeMentions, NotificationGroupTypeSecretChat, NotificationGroupTypeCalls, is, NotificationSettingsScope, constructor, NotificationSettingsScopePrivateChats, NotificationSettingsScopeGroupChats, NotificationSettingsScopeChannelChats, NotificationSound, NotificationSounds, is, NotificationType, constructor, NotificationTypeNewMessage, NotificationTypeNewSecretChat, NotificationTypeNewCall, NotificationTypeNewPushMessage, Ok, is, OptionValue, constructor, OptionValueBoolean, OptionValueEmpty, OptionValueInteger, OptionValueString, OrderInfo, is, PageBlock, constructor, PageBlockTitle, PageBlockSubtitle, PageBlockAuthorDate, PageBlockHeader, PageBlockSubheader, PageBlockKicker, PageBlockParagraph, PageBlockPreformatted, PageBlockFooter, PageBlockDivider, PageBlockAnchor, PageBlockList, PageBlockBlockQuote, PageBlockPullQuote, PageBlockAnimation, PageBlockAudio, PageBlockPhoto, PageBlockVideo, PageBlockVoiceNote, PageBlockCover, PageBlockEmbedded, PageBlockEmbeddedPost, PageBlockCollage, PageBlockSlideshow, PageBlockChatLink, PageBlockTable, PageBlockDetails, PageBlockRelatedArticles, PageBlockMap, PageBlockCaption, is, PageBlockHorizontalAlignment, constructor, PageBlockHorizontalAlignmentLeft, PageBlockHorizontalAlignmentCenter, PageBlockHorizontalAlignmentRight, PageBlockListItem, PageBlockRelatedArticle, PageBlockTableCell, is, PageBlockVerticalAlignment, constructor, PageBlockVerticalAlignmentTop, PageBlockVerticalAlignmentMiddle, PageBlockVerticalAlignmentBottom, is, PaidMedia, constructor, PaidMediaPreview, PaidMediaPhoto, PaidMediaVideo, PaidMediaUnsupported, PaidReactor, PassportAuthorizationForm, is, PassportElement, constructor, PassportElementPersonalDetails, PassportElementPassport, PassportElementDriverLicense, PassportElementIdentityCard, PassportElementInternalPassport, PassportElementAddress, PassportElementUtilityBill, PassportElementBankStatement, PassportElementRentalAgreement, PassportElementPassportRegistration, PassportElementTemporaryRegistration, PassportElementPhoneNumber, PassportElementEmailAddress, PassportElementError, is, PassportElementErrorSource, constructor, PassportElementErrorSourceUnspecified, PassportElementErrorSourceDataField, PassportElementErrorSourceFrontSide, PassportElementErrorSourceReverseSide, PassportElementErrorSourceSelfie, PassportElementErrorSourceTranslationFile, PassportElementErrorSourceTranslationFiles, PassportElementErrorSourceFile, PassportElementErrorSourceFiles, is, PassportElementType, constructor, PassportElementTypePersonalDetails, PassportElementTypePassport, PassportElementTypeDriverLicense, PassportElementTypeIdentityCard, PassportElementTypeInternalPassport, PassportElementTypeAddress, PassportElementTypeUtilityBill, PassportElementTypeBankStatement, PassportElementTypeRentalAgreement, PassportElementTypePassportRegistration, PassportElementTypeTemporaryRegistration, PassportElementTypePhoneNumber, PassportElementTypeEmailAddress, PassportElements, PassportElementsWithErrors, PassportRequiredElement, PassportSuitableElement, PasswordState, PaymentForm, is, PaymentFormType, constructor, PaymentFormTypeRegular, PaymentFormTypeStars, PaymentOption, is, PaymentProvider, constructor, PaymentProviderSmartGlocal, PaymentProviderStripe, PaymentProviderOther, PaymentReceipt, is, PaymentReceiptType, constructor, PaymentReceiptTypeRegular, PaymentReceiptTypeStars, PaymentResult, PersonalDetails, PersonalDocument, PhoneNumberAuthenticationSettings, is, PhoneNumberCodeType, constructor, PhoneNumberCodeTypeChange, PhoneNumberCodeTypeVerify, PhoneNumberCodeTypeConfirmOwnership, PhoneNumberInfo, Photo, PhotoSize, Point, Poll, PollOption, is, PollType, constructor, PollTypeRegular, PollTypeQuiz, is, PremiumFeature, constructor, PremiumFeatureIncreasedLimits, PremiumFeatureIncreasedUploadFileSize, PremiumFeatureImprovedDownloadSpeed, PremiumFeatureVoiceRecognition, PremiumFeatureDisabledAds, PremiumFeatureUniqueReactions, PremiumFeatureUniqueStickers, PremiumFeatureCustomEmoji, PremiumFeatureAdvancedChatManagement, PremiumFeatureProfileBadge, PremiumFeatureEmojiStatus, PremiumFeatureAnimatedProfilePhoto, PremiumFeatureForumTopicIcon, PremiumFeatureAppIcons, PremiumFeatureRealTimeChatTranslation, PremiumFeatureUpgradedStories, PremiumFeatureChatBoost, PremiumFeatureAccentColor, PremiumFeatureBackgroundForBoth, PremiumFeatureSavedMessagesTags, PremiumFeatureMessagePrivacy, PremiumFeatureLastSeenTimes, PremiumFeatureBusiness, PremiumFeatureMessageEffects, PremiumFeaturePromotionAnimation, PremiumFeatures, PremiumGiftCodeInfo, PremiumGiftCodePaymentOption, PremiumGiftCodePaymentOptions, is, PremiumGiveawayInfo, constructor, PremiumGiveawayInfoOngoing, PremiumGiveawayInfoCompleted, PremiumGiveawayParameters, is, PremiumGiveawayParticipantStatus, constructor, PremiumGiveawayParticipantStatusEligible, PremiumGiveawayParticipantStatusParticipating, PremiumGiveawayParticipantStatusAlreadyWasMember, PremiumGiveawayParticipantStatusAdministrator, PremiumGiveawayParticipantStatusDisallowedCountry, PremiumLimit, is, PremiumLimitType, constructor, PremiumLimitTypeSupergroupCount, PremiumLimitTypePinnedChatCount, PremiumLimitTypeCreatedPublicChatCount, PremiumLimitTypeSavedAnimationCount, PremiumLimitTypeFavoriteStickerCount, PremiumLimitTypeChatFolderCount, PremiumLimitTypeChatFolderChosenChatCount, PremiumLimitTypePinnedArchivedChatCount, PremiumLimitTypePinnedSavedMessagesTopicCount, PremiumLimitTypeCaptionLength, PremiumLimitTypeBioLength, PremiumLimitTypeChatFolderInviteLinkCount, PremiumLimitTypeShareableChatFolderCount, PremiumLimitTypeActiveStoryCount, PremiumLimitTypeWeeklySentStoryCount, PremiumLimitTypeMonthlySentStoryCount, PremiumLimitTypeStoryCaptionLength, PremiumLimitTypeStorySuggestedReactionAreaCount, PremiumLimitTypeSimilarChatCount, PremiumPaymentOption, is, PremiumSource, constructor, PremiumSourceLimitExceeded, PremiumSourceFeature, PremiumSourceBusinessFeature, PremiumSourceStoryFeature, PremiumSourceLink, PremiumSourceSettings, PremiumState, PremiumStatePaymentOption, is, PremiumStoryFeature, constructor, PremiumStoryFeaturePriorityOrder, PremiumStoryFeatureStealthMode, PremiumStoryFeaturePermanentViewsHistory, PremiumStoryFeatureCustomExpirationDuration, PremiumStoryFeatureSaveStories, PremiumStoryFeatureLinksAndFormatting, PremiumStoryFeatureVideoQuality, PrepaidPremiumGiveaway, ProductInfo, ProfileAccentColor, ProfileAccentColors, ProfilePhoto, Proxies, Proxy, is, ProxyType, constructor, ProxyTypeSocks5, ProxyTypeHttp, ProxyTypeMtproto, is, PublicChatType, constructor, PublicChatTypeHasUsername, PublicChatTypeIsLocationBased, is, PublicForward, constructor, PublicForwardMessage, PublicForwardStory, PublicForwards, is, PushMessageContent, constructor, PushMessageContentHidden, PushMessageContentAnimation, PushMessageContentAudio, PushMessageContentContact, PushMessageContentContactRegistered, PushMessageContentDocument, PushMessageContentGame, PushMessageContentGameScore, PushMessageContentInvoice, PushMessageContentLocation, PushMessageContentPaidMedia, PushMessageContentPhoto, PushMessageContentPoll, PushMessageContentPremiumGiftCode, PushMessageContentPremiumGiveaway, PushMessageContentScreenshotTaken, PushMessageContentSticker, PushMessageContentStory, PushMessageContentText, PushMessageContentVideo, PushMessageContentVideoNote, PushMessageContentVoiceNote, PushMessageContentBasicGroupChatCreate, PushMessageContentChatAddMembers, PushMessageContentChatChangePhoto, PushMessageContentChatChangeTitle, PushMessageContentChatSetBackground, PushMessageContentChatSetTheme, PushMessageContentChatDeleteMember, PushMessageContentChatJoinByLink, PushMessageContentChatJoinByRequest, PushMessageContentRecurringPayment, PushMessageContentSuggestProfilePhoto, PushMessageContentMessageForwards, PushMessageContentMediaAlbum, PushReceiverId, QuickReplyMessage, QuickReplyMessages, QuickReplyShortcut, ReactionNotificationSettings, is, ReactionNotificationSource, constructor, ReactionNotificationSourceNone, ReactionNotificationSourceContacts, ReactionNotificationSourceAll, is, ReactionType, constructor, ReactionTypeEmoji, ReactionTypeCustomEmoji, ReactionTypePaid, is, ReactionUnavailabilityReason, constructor, ReactionUnavailabilityReasonAnonymousAdministrator, ReactionUnavailabilityReasonGuest, ReadDatePrivacySettings, RecommendedChatFolder, RecommendedChatFolders, RecoveryEmailAddress, RemoteFile, is, ReplyMarkup, constructor, ReplyMarkupRemoveKeyboard, ReplyMarkupForceReply, ReplyMarkupShowKeyboard, ReplyMarkupInlineKeyboard, ReportChatSponsoredMessageOption, is, ReportChatSponsoredMessageResult, constructor, ReportChatSponsoredMessageResultOk, ReportChatSponsoredMessageResultFailed, ReportChatSponsoredMessageResultOptionRequired, ReportChatSponsoredMessageResultAdsHidden, ReportChatSponsoredMessageResultPremiumRequired, is, ReportReason, constructor, ReportReasonSpam, ReportReasonViolence, ReportReasonPornography, ReportReasonChildAbuse, ReportReasonCopyright, ReportReasonUnrelatedLocation, ReportReasonFake, ReportReasonIllegalDrugs, ReportReasonPersonalDetails, ReportReasonCustom, is, ResendCodeReason, constructor, ResendCodeReasonUserRequest, ResendCodeReasonVerificationFailed, is, ResetPasswordResult, constructor, ResetPasswordResultOk, ResetPasswordResultPending, ResetPasswordResultDeclined, is, RevenueWithdrawalState, constructor, RevenueWithdrawalStatePending, RevenueWithdrawalStateSucceeded, RevenueWithdrawalStateFailed, is, RichText, constructor, RichTextPlain, RichTextBold, RichTextItalic, RichTextUnderline, RichTextStrikethrough, RichTextFixed, RichTextUrl, RichTextEmailAddress, RichTextSubscript, RichTextSuperscript, RichTextMarked, RichTextPhoneNumber, RichTextIcon, RichTextReference, RichTextAnchor, RichTextAnchorLink, RichTexts, RtmpUrl, SavedCredentials, SavedMessagesTag, SavedMessagesTags, SavedMessagesTopic, is, SavedMessagesTopicType, constructor, SavedMessagesTopicTypeMyNotes, SavedMessagesTopicTypeAuthorHidden, SavedMessagesTopicTypeSavedFromChat, ScopeAutosaveSettings, ScopeNotificationSettings, is, SearchMessagesFilter, constructor, SearchMessagesFilterEmpty, SearchMessagesFilterAnimation, SearchMessagesFilterAudio, SearchMessagesFilterDocument, SearchMessagesFilterPhoto, SearchMessagesFilterVideo, SearchMessagesFilterVoiceNote, SearchMessagesFilterPhotoAndVideo, SearchMessagesFilterUrl, SearchMessagesFilterChatPhoto, SearchMessagesFilterVideoNote, SearchMessagesFilterVoiceAndVideoNote, SearchMessagesFilterMention, SearchMessagesFilterUnreadMention, SearchMessagesFilterUnreadReaction, SearchMessagesFilterFailedToSend, SearchMessagesFilterPinned, Seconds, SecretChat, is, SecretChatState, constructor, SecretChatStatePending, SecretChatStateReady, SecretChatStateClosed, SentWebAppMessage, Session, is, SessionType, constructor, SessionTypeAndroid, SessionTypeApple, SessionTypeBrave, SessionTypeChrome, SessionTypeEdge, SessionTypeFirefox, SessionTypeIpad, SessionTypeIphone, SessionTypeLinux, SessionTypeMac, SessionTypeOpera, SessionTypeSafari, SessionTypeUbuntu, SessionTypeUnknown, SessionTypeVivaldi, SessionTypeWindows, SessionTypeXbox, Sessions, SharedChat, SharedUser, ShippingOption, is, SpeechRecognitionResult, constructor, SpeechRecognitionResultPending, SpeechRecognitionResultText, SpeechRecognitionResultError, SponsoredMessage, SponsoredMessages, StarPaymentOption, StarPaymentOptions, StarRevenueStatistics, StarRevenueStatus, StarSubscription, StarSubscriptionPricing, StarSubscriptions, StarTransaction, is, StarTransactionDirection, constructor, StarTransactionDirectionIncoming, StarTransactionDirectionOutgoing, is, StarTransactionPartner, constructor, StarTransactionPartnerTelegram, StarTransactionPartnerAppStore, StarTransactionPartnerGooglePlay, StarTransactionPartnerFragment, StarTransactionPartnerTelegramAds, StarTransactionPartnerBot, StarTransactionPartnerBusiness, StarTransactionPartnerChannel, StarTransactionPartnerUser, StarTransactionPartnerUnsupported, StarTransactions, is, StatisticalGraph, constructor, StatisticalGraphData, StatisticalGraphAsync, StatisticalGraphError, StatisticalValue, Sticker, is, StickerFormat, constructor, StickerFormatWebp, StickerFormatTgs, StickerFormatWebm, is, StickerFullType, constructor, StickerFullTypeRegular, StickerFullTypeMask, StickerFullTypeCustomEmoji, StickerSet, StickerSetInfo, StickerSets, is, StickerType, constructor, StickerTypeRegular, StickerTypeMask, StickerTypeCustomEmoji, Stickers, StorageStatistics, StorageStatisticsByChat, StorageStatisticsByFileType, StorageStatisticsFast, is, StorePaymentPurpose, constructor, StorePaymentPurposePremiumSubscription, StorePaymentPurposeGiftedPremium, StorePaymentPurposePremiumGiftCodes, StorePaymentPurposePremiumGiveaway, StorePaymentPurposeStars, StorePaymentPurposeGiftedStars, Stories, Story, StoryArea, StoryAreaPosition, is, StoryAreaType, constructor, StoryAreaTypeLocation, StoryAreaTypeVenue, StoryAreaTypeSuggestedReaction, StoryAreaTypeMessage, StoryAreaTypeLink, StoryAreaTypeWeather, is, StoryContent, constructor, StoryContentPhoto, StoryContentVideo, StoryContentUnsupported, StoryFullId, StoryInfo, StoryInteraction, StoryInteractionInfo, is, StoryInteractionType, constructor, StoryInteractionTypeView, StoryInteractionTypeForward, StoryInteractionTypeRepost, StoryInteractions, is, StoryList, constructor, StoryListMain, StoryListArchive, is, StoryOrigin, constructor, StoryOriginPublicStory, StoryOriginHiddenUser, is, StoryPrivacySettings, constructor, StoryPrivacySettingsEveryone, StoryPrivacySettingsContacts, StoryPrivacySettingsCloseFriends, StoryPrivacySettingsSelectedUsers, StoryRepostInfo, StoryStatistics, StoryVideo, is, SuggestedAction, constructor, SuggestedActionEnableArchiveAndMuteNewChats, SuggestedActionCheckPassword, SuggestedActionCheckPhoneNumber, SuggestedActionViewChecksHint, SuggestedActionConvertToBroadcastGroup, SuggestedActionSetPassword, SuggestedActionUpgradePremium, SuggestedActionRestorePremium, SuggestedActionSubscribeToAnnualPremium, SuggestedActionGiftPremiumForChristmas, SuggestedActionSetBirthdate, SuggestedActionExtendPremium, SuggestedActionExtendStarSubscriptions, Supergroup, SupergroupFullInfo, is, SupergroupMembersFilter, constructor, SupergroupMembersFilterRecent, SupergroupMembersFilterContacts, SupergroupMembersFilterAdministrators, SupergroupMembersFilterSearch, SupergroupMembersFilterRestricted, SupergroupMembersFilterBanned, SupergroupMembersFilterMention, SupergroupMembersFilterBots, TMeUrl, is, TMeUrlType, constructor, TMeUrlTypeUser, TMeUrlTypeSupergroup, TMeUrlTypeChatInvite, TMeUrlTypeStickerSet, TMeUrls, is, TargetChat, constructor, TargetChatCurrent, TargetChatChosen, TargetChatInternalLink, is, TelegramPaymentPurpose, constructor, TelegramPaymentPurposePremiumGiftCodes, TelegramPaymentPurposePremiumGiveaway, TelegramPaymentPurposeStars, TelegramPaymentPurposeGiftedStars, TelegramPaymentPurposeJoinChat, TemporaryPasswordState, TermsOfService, TestBytes, TestInt, TestString, TestVectorInt, TestVectorIntObject, TestVectorString, TestVectorStringObject, Text, TextEntities, TextEntity, is, TextEntityType, constructor, TextEntityTypeMention, TextEntityTypeHashtag, TextEntityTypeCashtag, TextEntityTypeBotCommand, TextEntityTypeUrl, TextEntityTypeEmailAddress, TextEntityTypePhoneNumber, TextEntityTypeBankCardNumber, TextEntityTypeBold, TextEntityTypeItalic, TextEntityTypeUnderline, TextEntityTypeStrikethrough, TextEntityTypeSpoiler, TextEntityTypeCode, TextEntityTypePre, TextEntityTypePreCode, TextEntityTypeBlockQuote, TextEntityTypeExpandableBlockQuote, TextEntityTypeTextUrl, TextEntityTypeMentionName, TextEntityTypeCustomEmoji, TextEntityTypeMediaTimestamp, is, TextParseMode, constructor, TextParseModeMarkdown, TextParseModeHTML, TextQuote, ThemeParameters, ThemeSettings, Thumbnail, is, ThumbnailFormat, constructor, ThumbnailFormatJpeg, ThumbnailFormatGif, ThumbnailFormatMpeg4, ThumbnailFormatPng, ThumbnailFormatTgs, ThumbnailFormatWebm, ThumbnailFormatWebp, TimeZone, TimeZones, is, TopChatCategory, constructor, TopChatCategoryUsers, TopChatCategoryBots, TopChatCategoryGroups, TopChatCategoryChannels, TopChatCategoryInlineBots, TopChatCategoryWebAppBots, TopChatCategoryCalls, TopChatCategoryForwardChats, TrendingStickerSets, UnconfirmedSession, UnreadReaction, is, Update, constructor, UpdateAuthorizationState, UpdateNewMessage, UpdateMessageSendAcknowledged, UpdateMessageSendSucceeded, UpdateMessageSendFailed, UpdateMessageContent, UpdateMessageEdited, UpdateMessageIsPinned, UpdateMessageInteractionInfo, UpdateMessageContentOpened, UpdateMessageMentionRead, UpdateMessageUnreadReactions, UpdateMessageFactCheck, UpdateMessageLiveLocationViewed, UpdateNewChat, UpdateChatTitle, UpdateChatPhoto, UpdateChatAccentColors, UpdateChatPermissions, UpdateChatLastMessage, UpdateChatPosition, UpdateChatAddedToList, UpdateChatRemovedFromList, UpdateChatReadInbox, UpdateChatReadOutbox, UpdateChatActionBar, UpdateChatBusinessBotManageBar, UpdateChatAvailableReactions, UpdateChatDraftMessage, UpdateChatEmojiStatus, UpdateChatMessageSender, UpdateChatMessageAutoDeleteTime, UpdateChatNotificationSettings, UpdateChatPendingJoinRequests, UpdateChatReplyMarkup, UpdateChatBackground, UpdateChatTheme, UpdateChatUnreadMentionCount, UpdateChatUnreadReactionCount, UpdateChatVideoChat, UpdateChatDefaultDisableNotification, UpdateChatHasProtectedContent, UpdateChatIsTranslatable, UpdateChatIsMarkedAsUnread, UpdateChatViewAsTopics, UpdateChatBlockList, UpdateChatHasScheduledMessages, UpdateChatFolders, UpdateChatOnlineMemberCount, UpdateSavedMessagesTopic, UpdateSavedMessagesTopicCount, UpdateQuickReplyShortcut, UpdateQuickReplyShortcutDeleted, UpdateQuickReplyShortcuts, UpdateQuickReplyShortcutMessages, UpdateForumTopicInfo, UpdateScopeNotificationSettings, UpdateReactionNotificationSettings, UpdateNotification, UpdateNotificationGroup, UpdateActiveNotifications, UpdateHavePendingNotifications, UpdateDeleteMessages, UpdateChatAction, UpdateUserStatus, UpdateUser, UpdateBasicGroup, UpdateSupergroup, UpdateSecretChat, UpdateUserFullInfo, UpdateBasicGroupFullInfo, UpdateSupergroupFullInfo, UpdateServiceNotification, UpdateFile, UpdateFileGenerationStart, UpdateFileGenerationStop, UpdateFileDownloads, UpdateFileAddedToDownloads, UpdateFileDownload, UpdateFileRemovedFromDownloads, UpdateApplicationVerificationRequired, UpdateCall, UpdateGroupCall, UpdateGroupCallParticipant, UpdateNewCallSignalingData, UpdateUserPrivacySettingRules, UpdateUnreadMessageCount, UpdateUnreadChatCount, UpdateStory, UpdateStoryDeleted, UpdateStorySendSucceeded, UpdateStorySendFailed, UpdateChatActiveStories, UpdateStoryListChatCount, UpdateStoryStealthMode, UpdateOption, UpdateStickerSet, UpdateInstalledStickerSets, UpdateTrendingStickerSets, UpdateRecentStickers, UpdateFavoriteStickers, UpdateSavedAnimations, UpdateSavedNotificationSounds, UpdateDefaultBackground, UpdateChatThemes, UpdateAccentColors, UpdateProfileAccentColors, UpdateLanguagePackStrings, UpdateConnectionState, UpdateTermsOfService, UpdateUsersNearby, UpdateUnconfirmedSession, UpdateAttachmentMenuBots, UpdateWebAppMessageSent, UpdateActiveEmojiReactions, UpdateAvailableMessageEffects, UpdateDefaultReactionType, UpdateSavedMessagesTags, UpdateActiveLiveLocationMessages, UpdateOwnedStarCount, UpdateChatRevenueAmount, UpdateStarRevenueStatus, UpdateSpeechRecognitionTrial, UpdateDiceEmojis, UpdateAnimatedEmojiMessageClicked, UpdateAnimationSearchParameters, UpdateSuggestedActions, UpdateSpeedLimitNotification, UpdateContactCloseBirthdays, UpdateAutosaveSettings, UpdateBusinessConnection, UpdateNewBusinessMessage, UpdateBusinessMessageEdited, UpdateBusinessMessagesDeleted, UpdateNewInlineQuery, UpdateNewChosenInlineResult, UpdateNewCallbackQuery, UpdateNewInlineCallbackQuery, UpdateNewBusinessCallbackQuery, UpdateNewShippingQuery, UpdateNewPreCheckoutQuery, UpdateNewCustomEvent, UpdateNewCustomQuery, UpdatePoll, UpdatePollAnswer, UpdateChatMember, UpdateNewChatJoinRequest, UpdateChatBoost, UpdateMessageReaction, UpdateMessageReactions, Updates, User, UserFullInfo, UserLink, is, UserPrivacySetting, constructor, UserPrivacySettingShowStatus, UserPrivacySettingShowProfilePhoto, UserPrivacySettingShowLinkInForwardedMessages, UserPrivacySettingShowPhoneNumber, UserPrivacySettingShowBio, UserPrivacySettingShowBirthdate, UserPrivacySettingAllowChatInvites, UserPrivacySettingAllowCalls, UserPrivacySettingAllowPeerToPeerCalls, UserPrivacySettingAllowFindingByPhoneNumber, UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages, is, UserPrivacySettingRule, constructor, UserPrivacySettingRuleAllowAll, UserPrivacySettingRuleAllowContacts, UserPrivacySettingRuleAllowPremiumUsers, UserPrivacySettingRuleAllowUsers, UserPrivacySettingRuleAllowChatMembers, UserPrivacySettingRuleRestrictAll, UserPrivacySettingRuleRestrictContacts, UserPrivacySettingRuleRestrictUsers, UserPrivacySettingRuleRestrictChatMembers, UserPrivacySettingRules, is, UserStatus, constructor, UserStatusEmpty, UserStatusOnline, UserStatusOffline, UserStatusRecently, UserStatusLastWeek, UserStatusLastMonth, UserSupportInfo, is, UserType, constructor, UserTypeRegular, UserTypeDeleted, UserTypeBot, UserTypeUnknown, Usernames, Users, ValidatedOrderInfo, is, VectorPathCommand, constructor, VectorPathCommandLine, VectorPathCommandCubicBezierCurve, Venue, Video, VideoChat, VideoNote, VoiceNote, WebApp, WebAppInfo, WebPageInstantView, AcceptCall, AcceptTermsOfService, ActivateStoryStealthMode, AddBotMediaPreview, AddChatFolderByInviteLink, AddChatMember, AddChatMembers, AddChatToList, AddContact, AddCustomServerLanguagePack, AddFavoriteSticker, AddFileToDownloads, AddLocalMessage, AddLogMessage, AddMessageReaction, AddNetworkStatistics, AddPaidMessageReaction, AddProxy, AddQuickReplyShortcutInlineQueryResultMessage, AddQuickReplyShortcutMessage, AddQuickReplyShortcutMessageAlbum, AddRecentSticker, AddRecentlyFoundChat, AddSavedAnimation, AddSavedNotificationSound, AddStickerToSet, AllowBotToSendMessages, AnswerCallbackQuery, AnswerCustomQuery, AnswerInlineQuery, AnswerPreCheckoutQuery, AnswerShippingQuery, AnswerWebAppQuery, ApplyPremiumGiftCode, AssignAppStoreTransaction, AssignGooglePlayTransaction, BanChatMember, BlockMessageSenderFromReplies, BoostChat, CanBotSendMessages, CanPurchaseFromStore, CanSendMessageToUser, CanSendStory, CanTransferOwnership, CancelDownloadFile, CancelPasswordReset, CancelPreliminaryUploadFile, CancelRecoveryEmailAddressVerification, ChangeImportedContacts, ChangeStickerSet, CheckAuthenticationBotToken, CheckAuthenticationCode, CheckAuthenticationEmailCode, CheckAuthenticationPassword, CheckAuthenticationPasswordRecoveryCode, CheckChatFolderInviteLink, CheckChatInviteLink, CheckChatUsername, CheckCreatedPublicChatsLimit, CheckEmailAddressVerificationCode, CheckLoginEmailAddressCode, CheckPasswordRecoveryCode, CheckPhoneNumberCode, CheckPremiumGiftCode, CheckQuickReplyShortcutName, CheckRecoveryEmailAddressCode, CheckStickerSetName, CleanFileName, ClearAllDraftMessages, ClearAutosaveSettingsExceptions, ClearImportedContacts, ClearRecentEmojiStatuses, ClearRecentReactions, ClearRecentStickers, ClearRecentlyFoundChats, ClearSearchedForTags, ClickAnimatedEmojiMessage, ClickChatSponsoredMessage, ClickPremiumSubscriptionButton, Close, CloseChat, CloseSecretChat, CloseStory, CloseWebApp, ConfirmQrCodeAuthentication, ConfirmSession, CreateBasicGroupChat, CreateBusinessChatLink, CreateCall, CreateChatFolder, CreateChatFolderInviteLink, CreateChatInviteLink, CreateChatSubscriptionInviteLink, CreateForumTopic, CreateInvoiceLink, CreateNewBasicGroupChat, CreateNewSecretChat, CreateNewStickerSet, CreateNewSupergroupChat, CreatePrivateChat, CreateSecretChat, CreateSupergroupChat, CreateTemporaryPassword, CreateVideoChat, DeleteAccount, DeleteAllCallMessages, DeleteAllRevokedChatInviteLinks, DeleteBotMediaPreviews, DeleteBusinessChatLink, DeleteBusinessConnectedBot, DeleteChat, DeleteChatBackground, DeleteChatFolder, DeleteChatFolderInviteLink, DeleteChatHistory, DeleteChatMessagesByDate, DeleteChatMessagesBySender, DeleteChatReplyMarkup, DeleteCommands, DeleteDefaultBackground, DeleteFile, DeleteForumTopic, DeleteLanguagePack, DeleteMessages, DeletePassportElement, DeleteProfilePhoto, DeleteQuickReplyShortcut, DeleteQuickReplyShortcutMessages, DeleteRevokedChatInviteLink, DeleteSavedCredentials, DeleteSavedMessagesTopicHistory, DeleteSavedMessagesTopicMessagesByDate, DeleteSavedOrderInfo, DeleteStickerSet, DeleteStory, Destroy, DisableAllSupergroupUsernames, DisableProxy, DiscardCall, DisconnectAllWebsites, DisconnectWebsite, DownloadFile, EditBotMediaPreview, EditBusinessChatLink, EditBusinessMessageCaption, EditBusinessMessageLiveLocation, EditBusinessMessageMedia, EditBusinessMessageReplyMarkup, EditBusinessMessageText, EditChatFolder, EditChatFolderInviteLink, EditChatInviteLink, EditChatSubscriptionInviteLink, EditCustomLanguagePackInfo, EditForumTopic, EditInlineMessageCaption, EditInlineMessageLiveLocation, EditInlineMessageMedia, EditInlineMessageReplyMarkup, EditInlineMessageText, EditMessageCaption, EditMessageLiveLocation, EditMessageMedia, EditMessageReplyMarkup, EditMessageSchedulingState, EditMessageText, EditProxy, EditQuickReplyMessage, EditStarSubscription, EditStory, EditStoryCover, EnableProxy, EndGroupCall, EndGroupCallRecording, EndGroupCallScreenSharing, FinishFileGeneration, ForwardMessages, GetAccountTtl, GetActiveSessions, GetAllPassportElements, GetAllStickerEmojis, GetAnimatedEmoji, GetApplicationConfig, GetApplicationDownloadLink, GetArchiveChatListSettings, GetArchivedStickerSets, GetAttachedStickerSets, GetAttachmentMenuBot, GetAuthorizationState, GetAutoDownloadSettingsPresets, GetAutosaveSettings, GetAvailableChatBoostSlots, GetBackgroundUrl, GetBankCardInfo, GetBasicGroup, GetBasicGroupFullInfo, GetBlockedMessageSenders, GetBotInfoDescription, GetBotInfoShortDescription, GetBotMediaPreviewInfo, GetBotMediaPreviews, GetBotName, GetBusinessChatLinkInfo, GetBusinessChatLinks, GetBusinessConnectedBot, GetBusinessConnection, GetBusinessFeatures, GetCallbackQueryAnswer, GetCallbackQueryMessage, GetChat, GetChatActiveStories, GetChatAdministrators, GetChatArchivedStories, GetChatAvailableMessageSenders, GetChatBoostFeatures, GetChatBoostLevelFeatures, GetChatBoostLink, GetChatBoostLinkInfo, GetChatBoostStatus, GetChatBoosts, GetChatEventLog, GetChatFolder, GetChatFolderChatCount, GetChatFolderChatsToLeave, GetChatFolderDefaultIconName, GetChatFolderInviteLinks, GetChatFolderNewChats, GetChatHistory, GetChatInviteLink, GetChatInviteLinkCounts, GetChatInviteLinkMembers, GetChatInviteLinks, GetChatJoinRequests, GetChatListsToAddChat, GetChatMember, GetChatMessageByDate, GetChatMessageCalendar, GetChatMessageCount, GetChatMessagePosition, GetChatNotificationSettingsExceptions, GetChatPinnedMessage, GetChatPostedToChatPageStories, GetChatRevenueStatistics, GetChatRevenueTransactions, GetChatRevenueWithdrawalUrl, GetChatScheduledMessages, GetChatSimilarChatCount, GetChatSimilarChats, GetChatSparseMessagePositions, GetChatSponsoredMessages, GetChatStatistics, GetChatStoryInteractions, GetChats, GetChatsForChatFolderInviteLink, GetChatsToSendStories, GetCloseFriends, GetCollectibleItemInfo, GetCommands, GetConnectedWebsites, GetContacts, GetCountries, GetCountryCode, GetCountryFlagEmoji, GetCreatedPublicChats, GetCurrentState, GetCurrentWeather, GetCustomEmojiReactionAnimations, GetCustomEmojiStickers, GetDatabaseStatistics, GetDeepLinkInfo, GetDefaultBackgroundCustomEmojiStickers, GetDefaultChatEmojiStatuses, GetDefaultChatPhotoCustomEmojiStickers, GetDefaultEmojiStatuses, GetDefaultMessageAutoDeleteTime, GetDefaultProfilePhotoCustomEmojiStickers, GetDisallowedChatEmojiStatuses, GetEmojiCategories, GetEmojiReaction, GetEmojiSuggestionsUrl, GetExternalLink, GetExternalLinkInfo, GetFavoriteStickers, GetFile, GetFileDownloadedPrefixSize, GetFileExtension, GetFileMimeType, GetForumTopic, GetForumTopicDefaultIcons, GetForumTopicLink, GetForumTopics, GetGameHighScores, GetGreetingStickers, GetGroupCall, GetGroupCallInviteLink, GetGroupCallStreamSegment, GetGroupCallStreams, GetGroupsInCommon, GetImportedContactCount, GetInactiveSupergroupChats, GetInlineGameHighScores, GetInlineQueryResults, GetInstalledBackgrounds, GetInstalledStickerSets, GetInternalLink, GetInternalLinkType, GetJsonString, GetJsonValue, GetKeywordEmojis, GetLanguagePackInfo, GetLanguagePackString, GetLanguagePackStrings, GetLinkPreview, GetLocalizationTargetInfo, GetLogStream, GetLogTagVerbosityLevel, GetLogTags, GetLogVerbosityLevel, GetLoginUrl, GetLoginUrlInfo, GetMainWebApp, GetMapThumbnailFile, GetMarkdownText, GetMe, GetMenuButton, GetMessage, GetMessageAddedReactions, GetMessageAvailableReactions, GetMessageEffect, GetMessageEmbeddingCode, GetMessageFileType, GetMessageImportConfirmationText, GetMessageLink, GetMessageLinkInfo, GetMessageLocally, GetMessageProperties, GetMessagePublicForwards, GetMessageReadDate, GetMessageStatistics, GetMessageThread, GetMessageThreadHistory, GetMessageViewers, GetMessages, GetNetworkStatistics, GetNewChatPrivacySettings, GetOption, GetOwnedStickerSets, GetPassportAuthorizationForm, GetPassportAuthorizationFormAvailableElements, GetPassportElement, GetPasswordState, GetPaymentForm, GetPaymentReceipt, GetPhoneNumberInfo, GetPhoneNumberInfoSync, GetPollVoters, GetPopularWebAppBots, GetPreferredCountryLanguage, GetPremiumFeatures, GetPremiumGiftCodePaymentOptions, GetPremiumGiveawayInfo, GetPremiumLimit, GetPremiumState, GetPremiumStickerExamples, GetPremiumStickers, GetProxies, GetProxyLink, GetPushReceiverId, GetReadDatePrivacySettings, GetRecentEmojiStatuses, GetRecentInlineBots, GetRecentStickers, GetRecentlyOpenedChats, GetRecentlyVisitedTMeUrls, GetRecommendedChatFolders, GetRecommendedChats, GetRecoveryEmailAddress, GetRemoteFile, GetRepliedMessage, GetSavedAnimations, GetSavedMessagesTags, GetSavedMessagesTopicHistory, GetSavedMessagesTopicMessageByDate, GetSavedNotificationSound, GetSavedNotificationSounds, GetSavedOrderInfo, GetScopeNotificationSettings, GetSearchedForTags, GetSecretChat, GetStarAdAccountUrl, GetStarGiftPaymentOptions, GetStarPaymentOptions, GetStarRevenueStatistics, GetStarSubscriptions, GetStarTransactions, GetStarWithdrawalUrl, GetStatisticalGraph, GetStickerEmojis, GetStickerSet, GetStickers, GetStorageStatistics, GetStorageStatisticsFast, GetStory, GetStoryAvailableReactions, GetStoryInteractions, GetStoryNotificationSettingsExceptions, GetStoryPublicForwards, GetStoryStatistics, GetSuggestedFileName, GetSuggestedStickerSetName, GetSuitableDiscussionChats, GetSuitablePersonalChats, GetSupergroup, GetSupergroupFullInfo, GetSupergroupMembers, GetSupportName, GetSupportUser, GetTemporaryPasswordState, GetTextEntities, GetThemeParametersJsonString, GetThemedChatEmojiStatuses, GetThemedEmojiStatuses, GetTimeZones, GetTopChats, GetTrendingStickerSets, GetUser, GetUserChatBoosts, GetUserFullInfo, GetUserLink, GetUserPrivacySettingRules, GetUserProfilePhotos, GetUserSupportInfo, GetVideoChatAvailableParticipants, GetVideoChatRtmpUrl, GetWebAppLinkUrl, GetWebAppUrl, GetWebPageInstantView, HideContactCloseBirthdays, HideSuggestedAction, ImportContacts, ImportMessages, InviteGroupCallParticipants, JoinChat, JoinChatByInviteLink, JoinGroupCall, LaunchPrepaidPremiumGiveaway, LeaveChat, LeaveGroupCall, LoadActiveStories, LoadChats, LoadGroupCallParticipants, LoadQuickReplyShortcutMessages, LoadQuickReplyShortcuts, LoadSavedMessagesTopics, LogOut, OpenChat, OpenChatSimilarChat, OpenMessageContent, OpenStory, OpenWebApp, OptimizeStorage, ParseMarkdown, ParseTextEntities, PinChatMessage, PingProxy, PreliminaryUploadFile, ProcessChatFolderNewChats, ProcessChatJoinRequest, ProcessChatJoinRequests, ProcessPushNotification, RateSpeechRecognition, ReadAllChatMentions, ReadAllChatReactions, ReadAllMessageThreadMentions, ReadAllMessageThreadReactions, ReadChatList, ReadFilePart, ReaddQuickReplyShortcutMessages, RecognizeSpeech, RecoverAuthenticationPassword, RecoverPassword, RefundStarPayment, RegisterDevice, RegisterUser, RemoveAllFilesFromDownloads, RemoveBusinessConnectedBotFromChat, RemoveChatActionBar, RemoveContacts, RemoveFavoriteSticker, RemoveFileFromDownloads, RemoveInstalledBackground, RemoveMessageReaction, RemoveNotification, RemoveNotificationGroup, RemovePendingPaidMessageReactions, RemoveProxy, RemoveRecentHashtag, RemoveRecentSticker, RemoveRecentlyFoundChat, RemoveSavedAnimation, RemoveSavedNotificationSound, RemoveSearchedForTag, RemoveStickerFromSet, RemoveTopChat, ReorderActiveUsernames, ReorderBotActiveUsernames, ReorderBotMediaPreviews, ReorderChatFolders, ReorderInstalledStickerSets, ReorderQuickReplyShortcuts, ReorderSupergroupActiveUsernames, ReplacePrimaryChatInviteLink, ReplaceStickerInSet, ReplaceVideoChatRtmpUrl, ReportAuthenticationCodeMissing, ReportChat, ReportChatPhoto, ReportChatSponsoredMessage, ReportMessageReactions, ReportPhoneNumberCodeMissing, ReportStory, ReportSupergroupAntiSpamFalsePositive, ReportSupergroupSpam, RequestAuthenticationPasswordRecovery, RequestPasswordRecovery, RequestQrCodeAuthentication, ResendAuthenticationCode, ResendEmailAddressVerificationCode, ResendLoginEmailAddressCode, ResendMessages, ResendPhoneNumberCode, ResendRecoveryEmailAddressCode, ResetAllNotificationSettings, ResetAuthenticationEmailAddress, ResetInstalledBackgrounds, ResetNetworkStatistics, ResetPassword, ReuseStarSubscription, RevokeChatInviteLink, RevokeGroupCallInviteLink, SaveApplicationLogEvent, SearchBackground, SearchCallMessages, SearchChatMembers, SearchChatMessages, SearchChatRecentLocationMessages, SearchChats, SearchChatsNearby, SearchChatsOnServer, SearchContacts, SearchEmojis, SearchFileDownloads, SearchHashtags, SearchInstalledStickerSets, SearchMessages, SearchOutgoingDocumentMessages, SearchPublicChat, SearchPublicChats, SearchPublicMessagesByTag, SearchPublicStoriesByLocation, SearchPublicStoriesByTag, SearchPublicStoriesByVenue, SearchQuote, SearchRecentlyFoundChats, SearchSavedMessages, SearchSecretMessages, SearchStickerSet, SearchStickerSets, SearchStickers, SearchStringsByPrefix, SearchUserByPhoneNumber, SearchUserByToken, SearchWebApp, SendAuthenticationFirebaseSms, SendBotStartMessage, SendBusinessMessage, SendBusinessMessageAlbum, SendCallDebugInformation, SendCallLog, SendCallRating, SendCallSignalingData, SendChatAction, SendCustomRequest, SendEmailAddressVerificationCode, SendInlineQueryResultMessage, SendMessage, SendMessageAlbum, SendPassportAuthorizationForm, SendPaymentForm, SendPhoneNumberCode, SendPhoneNumberFirebaseSms, SendQuickReplyShortcutMessages, SendStory, SendWebAppCustomRequest, SendWebAppData, SetAccentColor, SetAccountTtl, SetAlarm, SetApplicationVerificationToken, SetArchiveChatListSettings, SetAuthenticationEmailAddress, SetAuthenticationPhoneNumber, SetAutoDownloadSettings, SetAutosaveSettings, SetBio, SetBirthdate, SetBotInfoDescription, SetBotInfoShortDescription, SetBotName, SetBotProfilePhoto, SetBotUpdatesStatus, SetBusinessAwayMessageSettings, SetBusinessConnectedBot, SetBusinessGreetingMessageSettings, SetBusinessLocation, SetBusinessMessageIsPinned, SetBusinessOpeningHours, SetBusinessStartPage, SetChatAccentColor, SetChatActiveStoriesList, SetChatAvailableReactions, SetChatBackground, SetChatClientData, SetChatDescription, SetChatDiscussionGroup, SetChatDraftMessage, SetChatEmojiStatus, SetChatLocation, SetChatMemberStatus, SetChatMessageAutoDeleteTime, SetChatMessageSender, SetChatNotificationSettings, SetChatPermissions, SetChatPhoto, SetChatPinnedStories, SetChatProfileAccentColor, SetChatSlowModeDelay, SetChatTheme, SetChatTitle, SetCloseFriends, SetCommands, SetCustomEmojiStickerSetThumbnail, SetCustomLanguagePack, SetCustomLanguagePackString, SetDatabaseEncryptionKey, SetDefaultBackground, SetDefaultChannelAdministratorRights, SetDefaultGroupAdministratorRights, SetDefaultMessageAutoDeleteTime, SetDefaultReactionType, SetEmojiStatus, SetFileGenerationProgress, SetForumTopicNotificationSettings, SetGameScore, SetGroupCallParticipantIsSpeaking, SetGroupCallParticipantVolumeLevel, SetGroupCallTitle, SetInactiveSessionTtl, SetInlineGameScore, SetLocation, SetLogStream, SetLogTagVerbosityLevel, SetLogVerbosityLevel, SetLoginEmailAddress, SetMenuButton, SetMessageFactCheck, SetMessageReactions, SetMessageSenderBlockList, SetName, SetNetworkType, SetNewChatPrivacySettings, SetOption, SetPassportElement, SetPassportElementErrors, SetPassword, SetPersonalChat, SetPinnedChats, SetPinnedForumTopics, SetPinnedSavedMessagesTopics, SetPollAnswer, SetProfileAccentColor, SetProfilePhoto, SetQuickReplyShortcutName, SetReactionNotificationSettings, SetReadDatePrivacySettings, SetRecoveryEmailAddress, SetSavedMessagesTagLabel, SetScopeNotificationSettings, SetStickerEmojis, SetStickerKeywords, SetStickerMaskPosition, SetStickerPositionInSet, SetStickerSetThumbnail, SetStickerSetTitle, SetStoryPrivacySettings, SetStoryReaction, SetSupergroupCustomEmojiStickerSet, SetSupergroupStickerSet, SetSupergroupUnrestrictBoostCount, SetSupergroupUsername, SetTdlibParameters, SetUserPersonalProfilePhoto, SetUserPrivacySettingRules, SetUserSupportInfo, SetUsername, SetVideoChatDefaultParticipant, ShareChatWithBot, SharePhoneNumber, ShareUsersWithBot, StartGroupCallRecording, StartGroupCallScreenSharing, StartScheduledGroupCall, StopBusinessPoll, StopPoll, SuggestUserProfilePhoto, SynchronizeLanguagePack, TerminateAllOtherSessions, TerminateSession, TestCallBytes, TestCallEmpty, TestCallString, TestCallVectorInt, TestCallVectorIntObject, TestCallVectorString, TestCallVectorStringObject, TestGetDifference, TestNetwork, TestProxy, TestReturnError, TestSquareInt, TestUseUpdate, ToggleAllDownloadsArePaused, ToggleBotIsAddedToAttachmentMenu, ToggleBotUsernameIsActive, ToggleBusinessConnectedBotChatIsPaused, ToggleChatDefaultDisableNotification, ToggleChatFolderTags, ToggleChatHasProtectedContent, ToggleChatIsMarkedAsUnread, ToggleChatIsPinned, ToggleChatIsTranslatable, ToggleChatViewAsTopics, ToggleDownloadIsPaused, ToggleForumTopicIsClosed, ToggleForumTopicIsPinned, ToggleGeneralForumTopicIsHidden, ToggleGroupCallEnabledStartNotification, ToggleGroupCallIsMyVideoEnabled, ToggleGroupCallIsMyVideoPaused, ToggleGroupCallMuteNewParticipants, ToggleGroupCallParticipantIsHandRaised, ToggleGroupCallParticipantIsMuted, ToggleGroupCallScreenSharingIsPaused, ToggleHasSponsoredMessagesEnabled, TogglePaidMessageReactionIsAnonymous, ToggleSavedMessagesTopicIsPinned, ToggleSessionCanAcceptCalls, ToggleSessionCanAcceptSecretChats, ToggleStoryIsPostedToChatPage, ToggleSupergroupCanHaveSponsoredMessages, ToggleSupergroupHasAggressiveAntiSpamEnabled, ToggleSupergroupHasHiddenMembers, ToggleSupergroupIsAllHistoryAvailable, ToggleSupergroupIsBroadcastGroup, ToggleSupergroupIsForum, ToggleSupergroupJoinByRequest, ToggleSupergroupJoinToSendMessages, ToggleSupergroupSignMessages, ToggleSupergroupUsernameIsActive, ToggleUsernameIsActive, TransferChatOwnership, TranslateMessageText, TranslateText, UnpinAllChatMessages, UnpinAllMessageThreadMessages, UnpinChatMessage, UpgradeBasicGroupChatToSupergroupChat, UploadStickerFile, ValidateOrderInfo, ViewMessages, ViewPremiumFeature, ViewTrendingStickerSets, WriteGeneratedFilePart

## 📂 C:\Users\mansu\Desktop\app\TDLibAndroidImplementation-main\TDLibAndroidImplementation-main\app\src\test\java\com\genius\tdlibandroid\ExampleUnitTest.kt
**Imports:**
```
import org.junit.Test
import org.junit.Assert.*
```

**Classes:** ExampleUnitTest

**Functions:** addition_isCorrect


---
## 📊 Project Structure Diagram
```mermaid
graph TD
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/Alarm.kt" --> "Alarm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AlarmAdapter.kt" --> "AlarmAdapter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AlarmAdapter.kt" --> "AlarmViewHolder"
    "AlarmAdapter" --> "onItemClick"
    "AlarmAdapter" --> "onSwitchToggle"
    "AlarmAdapter" --> "onCreateViewHolder"
    "AlarmAdapter" --> "onBindViewHolder"
    "AlarmAdapter" --> "getItemCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AlarmReceiver.kt" --> "AlarmReceiver"
    "AlarmReceiver" --> "onReceive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AlarmService.kt" --> "AlarmService"
    "AlarmService" --> "onBind"
    "AlarmService" --> "onStartCommand"
    "AlarmService" --> "playAlarmSound"
    "AlarmService" --> "buildNotification"
    "AlarmService" --> "createChannelIfNeeded"
    "AlarmService" --> "onDestroy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AppModule.kt" --> "AppModule"
    "AppModule" --> "bindTelegramClient"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AuthDebugActivity.kt" --> "AuthDebugActivity"
    "AuthDebugActivity" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AuthState.kt" --> "AuthState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/AuthState.kt" --> "Error"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/ChatViewModel.kt" --> "ChatUiState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/ChatViewModel.kt" --> "ChatViewModel"
    "ChatUiState" --> "init"
    "ChatUiState" --> "startUpdates"
    "ChatUiState" --> "onInputChange"
    "ChatUiState" --> "sendMessage"
    "ChatUiState" --> "onCleared"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/ExampleInstrumentedTest.kt" --> "ExampleInstrumentedTest"
    "ExampleInstrumentedTest" --> "useAppContext"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/ExampleUnitTest.kt" --> "ExampleUnitTest"
    "ExampleUnitTest" --> "addition_isCorrect"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/HiddenTelegramActivity.kt" --> "HiddenTelegramActivity"
    "HiddenTelegramActivity" --> "onCreate"
    "HiddenTelegramActivity" --> "App"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/HomeActivity.kt" --> "HomeActivity"
    "HomeActivity" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/HomeViewModel.kt" --> "HomeViewModel"
    "HomeViewModel" --> "loadChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/LoginStates.kt" --> "LoginStates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/LoginStates.kt" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/LoginStates.kt" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/LoginStates.kt" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/LoginViewModel.kt" --> "LoginViewModel"
    "LoginViewModel" --> "sendPhoneNumber"
    "LoginViewModel" --> "sendCode"
    "LoginViewModel" --> "sendPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/MainActivity.kt" --> "MainActivity"
    "MainActivity" --> "onCreate"
    "MainActivity" --> "checkAndRequestExactAlarmPermission"
    "MainActivity" --> "askForNotificationPermission"
    "MainActivity" --> "setupRecyclerView"
    "MainActivity" --> "showAlarmDialog"
    "MainActivity" --> "scheduleNormalAlarm"
    "MainActivity" --> "scheduleAlarm"
    "MainActivity" --> "cancelAlarm"
    "MainActivity" --> "onItemClick"
    "MainActivity" --> "onSwitchToggle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/MyApp.kt" --> "MyApp"
    "MyApp" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/Screen.kt" --> "Screen"
    "Screen" --> "buildRoute"
    "Screen" --> "getChatId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/SplashViewModel.kt" --> "SplashViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TelegramClientImpl.kt" --> "TelegramClientImpl"
    "TelegramClientImpl" --> "handleAuthorizationState"
    "TelegramClientImpl" --> "setupTdlibParameters"
    "TelegramClientImpl" --> "send"
    "TelegramClientImpl" --> "setPhoneNumber"
    "TelegramClientImpl" --> "checkCode"
    "TelegramClientImpl" --> "checkPassword"
    "TelegramClientImpl" --> "logOut"
    "TelegramClientImpl" --> "getMe"
    "TelegramClientImpl" --> "getChats"
    "TelegramClientImpl" --> "getChat"
    "TelegramClientImpl" --> "openChat"
    "TelegramClientImpl" --> "closeChat"
    "TelegramClientImpl" --> "getChatHistory"
    "TelegramClientImpl" --> "getMessage"
    "TelegramClientImpl" --> "viewMessages"
    "TelegramClientImpl" --> "sendTyping"
    "TelegramClientImpl" --> "sendTextMessage"
    "TelegramClientImpl" --> "searchChats"
    "TelegramClientImpl" --> "editMessageText"
    "TelegramClientImpl" --> "deleteMessages"
    "TelegramClientImpl" --> "downloadFile"
    "TelegramClientImpl" --> "getFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgAuthRepository.kt" --> "TgAuthRepository"
    "TgAuthRepository" --> "setPhoneNumber"
    "TgAuthRepository" --> "checkCode"
    "TgAuthRepository" --> "checkPassword"
    "TgAuthRepository" --> "logOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgBaseViewModel.kt" --> "TgBaseViewModel"
    "TgBaseViewModel" --> "getAuthStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgChatRepository.kt" --> "TgChatRepository"
    "TgChatRepository" --> "openChat"
    "TgChatRepository" --> "closeChat"
    "TgChatRepository" --> "getHistory"
    "TgChatRepository" --> "sendText"
    "TgChatRepository" --> "markRead"
    "TgChatRepository" --> "sendTyping"
    "TgChatRepository" --> "getMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgCore.kt" --> "TgCore"
    "TgCore" --> "initialize"
    "TgCore" --> "setPhone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgErrors.kt" --> "TgValidationError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/project-inventory-20250816_230724/all-project-files/TgUserRepository.kt" --> "TgUserRepository"
    "TgUserRepository" --> "getMe"
    "TgUserRepository" --> "getChats"
    "TgUserRepository" --> "getChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "LibrariesForLibs"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AccompanistLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxActivityLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxComposeLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxCoreLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxEspressoLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxLifecycleLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxLifecycleRuntimeLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxLifecycleViewmodelLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxPagingLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxUiLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxUiTestLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidxUiToolingLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "HiltLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "HiltNavigationLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "KotlinxLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "KotlinxCoroutinesLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "VersionAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "BundleAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "PluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "AndroidPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "HiltPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "JetbrainsPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibs.java" --> "JetbrainsKotlinPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "LibrariesForLibsInPluginsBlock"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AccompanistLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxActivityLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxComposeLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxCoreLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxEspressoLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxLifecycleLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxLifecycleRuntimeLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxLifecycleViewmodelLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxPagingLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxUiLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxUiTestLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidxUiToolingLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "HiltLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "HiltNavigationLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "KotlinxLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "KotlinxCoroutinesLibraryAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "VersionAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "BundleAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "PluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "AndroidPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "HiltPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "JetbrainsPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/.gradle/8.7/dependencies-accessors/23201f89ac621c997df5153520236fa24e75d498/sources/org/gradle/accessors/dm/LibrariesForLibsInPluginsBlock.java" --> "JetbrainsKotlinPluginAccessors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/debug/out/com/genius/tdlibandroid/databinding/ActivityAuthDebugBinding.java" --> "ActivityAuthDebugBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/debug/out/com/genius/tdlibandroid/databinding/ActivityHomeBinding.java" --> "ActivityHomeBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/debug/out/com/genius/tdlibandroid/databinding/ActivityMainBinding.java" --> "ActivityMainBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/debug/out/com/genius/tdlibandroid/databinding/AlarmItemBinding.java" --> "AlarmItemBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/debug/out/com/genius/tdlibandroid/databinding/DialogAddAlarmBinding.java" --> "DialogAddAlarmBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/release/out/com/genius/tdlibandroid/databinding/ActivityAuthDebugBinding.java" --> "ActivityAuthDebugBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/release/out/com/genius/tdlibandroid/databinding/ActivityHomeBinding.java" --> "ActivityHomeBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/release/out/com/genius/tdlibandroid/databinding/ActivityMainBinding.java" --> "ActivityMainBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/release/out/com/genius/tdlibandroid/databinding/AlarmItemBinding.java" --> "AlarmItemBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/data_binding_base_class_source_out/release/out/com/genius/tdlibandroid/databinding/DialogAddAlarmBinding.java" --> "DialogAddAlarmBinding"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "DaggerMyApp_HiltComponents_SingletonC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "Builder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityRetainedCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "FragmentCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewWithFragmentCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewModelCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ServiceCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewWithFragmentCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "FragmentCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "LazyClassKeyProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewModelCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "LazyClassKeyProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityRetainedCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ServiceCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SingletonCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/Hilt_MyApp.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/Hilt_MyApp.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/Hilt_MyApp.java" --> "Hilt_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "MyApp_HiltComponents"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "SingletonC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ServiceC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ActivityRetainedC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ActivityC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewModelC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "FragmentC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/debug/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewWithFragmentC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "DaggerMyApp_HiltComponents_SingletonC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "Builder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityRetainedCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "FragmentCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewWithFragmentCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewModelCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ServiceCBuilder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewWithFragmentCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "FragmentCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "LazyClassKeyProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ViewModelCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "LazyClassKeyProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ActivityRetainedCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "ServiceCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SingletonCImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/DaggerMyApp_HiltComponents_SingletonC.java" --> "SwitchingProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/Hilt_MyApp.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/Hilt_MyApp.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/Hilt_MyApp.java" --> "Hilt_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "MyApp_HiltComponents"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "SingletonC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ServiceC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ActivityRetainedC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ActivityC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewModelC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "FragmentC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_sources/release/com/genius/tdlibandroid/MyApp_HiltComponents.java" --> "ViewWithFragmentC"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_trees/debug/com/genius/tdlibandroid/MyApp_ComponentTreeDeps.java" --> "MyApp_ComponentTreeDeps"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_trees/debug/dagger/hilt/internal/processedrootsentinel/codegen/_com_genius_tdlibandroid_MyApp.java" --> "_com_genius_tdlibandroid_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_trees/release/com/genius/tdlibandroid/MyApp_ComponentTreeDeps.java" --> "MyApp_ComponentTreeDeps"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/hilt/component_trees/release/dagger/hilt/internal/processedrootsentinel/codegen/_com_genius_tdlibandroid_MyApp.java" --> "_com_genius_tdlibandroid_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/MyApp_MembersInjector.java" --> "MyApp_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_Factory.java" --> "TgBaseViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "TgBaseViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "TgBaseViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/data/TelegramClientImpl_Factory.java" --> "TelegramClientImpl_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/data/TgCore_Factory.java" --> "TgCore_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/data/tgRepos/TgAuthRepository_Factory.java" --> "TgAuthRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/data/tgRepos/TgChatRepository_Factory.java" --> "TgChatRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/data/tgRepos/TgUserRepository_Factory.java" --> "TgUserRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/HiddenTelegramActivity_MembersInjector.java" --> "HiddenTelegramActivity_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "Hilt_HiddenTelegramActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_Factory.java" --> "ChatViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "ChatViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "ChatViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "Hilt_HomeActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeActivity_MembersInjector.java" --> "HomeActivity_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_Factory.java" --> "HomeViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "HomeViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "HomeViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_Factory.java" --> "LoginViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "LoginViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "LoginViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_Factory.java" --> "SplashViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_Factory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "SplashViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "SplashViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "_com_genius_tdlibandroid_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "_com_genius_tdlibandroid_di_AppModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "_com_genius_tdlibandroid_MyApp_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/debug/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/MyApp_MembersInjector.java" --> "MyApp_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_Factory.java" --> "TgBaseViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "TgBaseViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "TgBaseViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/core/TgBaseViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/data/TelegramClientImpl_Factory.java" --> "TelegramClientImpl_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/data/TgCore_Factory.java" --> "TgCore_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/data/tgRepos/TgAuthRepository_Factory.java" --> "TgAuthRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/data/tgRepos/TgChatRepository_Factory.java" --> "TgChatRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/data/tgRepos/TgUserRepository_Factory.java" --> "TgUserRepository_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/HiddenTelegramActivity_MembersInjector.java" --> "HiddenTelegramActivity_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/Hilt_HiddenTelegramActivity.java" --> "Hilt_HiddenTelegramActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_Factory.java" --> "ChatViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "ChatViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "ChatViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "to"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "via"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/Hilt_HomeActivity.java" --> "Hilt_HomeActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeActivity_MembersInjector.java" --> "HomeActivity_MembersInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_Factory.java" --> "HomeViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "HomeViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "HomeViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/home/HomeViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_Factory.java" --> "LoginViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "LoginViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "LoginViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/login/LoginViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_Factory.java" --> "SplashViewModel_Factory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_Factory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "SplashViewModel_HiltModules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules.java" --> "KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "SplashViewModel_HiltModules_KeyModule_ProvideFactory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel_HiltModules_KeyModule_ProvideFactory.java" --> "InstanceHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/dagger/hilt/internal/aggregatedroot/codegen/_com_genius_tdlibandroid_MyApp.java" --> "_com_genius_tdlibandroid_MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_core_TgBaseViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_di_AppModule.java" --> "_com_genius_tdlibandroid_di_AppModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_MyApp_GeneratedInjector.java" --> "_com_genius_tdlibandroid_MyApp_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_chat_ChatViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector.java" --> "_com_genius_tdlibandroid_presentation_HiddenTelegramActivity_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector.java" --> "_com_genius_tdlibandroid_presentation_home_HomeActivity_GeneratedInjector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_home_HomeViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_login_LoginViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule.java" --> "_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_BindsModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "should"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "aggregates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/generated/source/kapt/release/hilt_aggregated_deps/_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule.java" --> "_com_genius_tdlibandroid_presentation_splash_SplashViewModel_HiltModules_KeyModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/Alarm.java" --> "Alarm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/AlarmAdapter.java" --> "AlarmAdapter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/AlarmAdapter.java" --> "AlarmViewHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/AlarmReceiver.java" --> "AlarmReceiver"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/AlarmService.java" --> "AlarmService"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/MainActivity.java" --> "MainActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/MyApp.java" --> "MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgBaseViewModel.java" --> "TgBaseViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Authenticated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Closed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Init"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Loading"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "LoggedOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Unknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "AuthState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "Closed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "Error"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "LoggingOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "Ready"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "Uninitialized"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "WaitCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "WaitPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "WaitPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/AuthState.java" --> "WaitTdlibParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/TelegramClientImpl.java" --> "TelegramClientImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/TgCore.java" --> "TgCore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/TgValidationError.java" --> "TgValidationError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/TgValidationError.java" --> "PasswordError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/TgValidationError.java" --> "PhoneNumberError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/tgRepos/TgAuthRepository.java" --> "TgAuthRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/tgRepos/TgChatRepository.java" --> "TgChatRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/data/tgRepos/TgUserRepository.java" --> "TgUserRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/di/AppModule.java" --> "AppModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/HiddenTelegramActivity.java" --> "HiddenTelegramActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/HiddenTelegramActivityKt.java" --> "HiddenTelegramActivityKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/Screen.java" --> "Screen"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/Screen.java" --> "Chat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/Screen.java" --> "Home"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/Screen.java" --> "Login"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/Screen.java" --> "Splash"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/auth/AuthDebugActivity.java" --> "AuthDebugActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/chat/ChatScreenKt.java" --> "ChatScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/chat/ChatUiState.java" --> "ChatUiState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/chat/ChatViewModel.java" --> "ChatViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/home/HomeActivity.java" --> "HomeActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/home/HomeScreenKt.java" --> "HomeScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/home/HomeViewModel.java" --> "HomeViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginScreenKt.java" --> "LoginScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "LoginStates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "Authenticated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "Loading"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "LoggedOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/login/LoginViewModel.java" --> "LoginViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/navigation/AppNavGrapKt.java" --> "AppNavGrapKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/navigation/NavRoutes.java" --> "NavRoutes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/splash/SplashScreenKt.java" --> "SplashScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/presentation/splash/SplashViewModel.java" --> "SplashViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/ui/theme/ColorKt.java" --> "ColorKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/ui/theme/ThemeKt.java" --> "ThemeKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/com/genius/tdlibandroid/ui/theme/TypeKt.java" --> "TypeKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/debug/error/NonExistentClass.java" --> "NonExistentClass"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/Alarm.java" --> "Alarm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/AlarmAdapter.java" --> "AlarmAdapter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/AlarmAdapter.java" --> "AlarmViewHolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/AlarmReceiver.java" --> "AlarmReceiver"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/AlarmService.java" --> "AlarmService"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/MainActivity.java" --> "MainActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/MyApp.java" --> "MyApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgBaseViewModel.java" --> "TgBaseViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Authenticated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Closed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Init"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Loading"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "LoggedOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/core/TgUserAuthState.java" --> "Unknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "AuthState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "Closed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "Error"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "LoggingOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "Ready"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "Uninitialized"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "WaitCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "WaitPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "WaitPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/AuthState.java" --> "WaitTdlibParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/TelegramClientImpl.java" --> "TelegramClientImpl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/TgCore.java" --> "TgCore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/TgValidationError.java" --> "TgValidationError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/TgValidationError.java" --> "PasswordError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/TgValidationError.java" --> "PhoneNumberError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/tgRepos/TgAuthRepository.java" --> "TgAuthRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/tgRepos/TgChatRepository.java" --> "TgChatRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/data/tgRepos/TgUserRepository.java" --> "TgUserRepository"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/di/AppModule.java" --> "AppModule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/HiddenTelegramActivity.java" --> "HiddenTelegramActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/HiddenTelegramActivityKt.java" --> "HiddenTelegramActivityKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/Screen.java" --> "Screen"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/Screen.java" --> "Chat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/Screen.java" --> "Home"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/Screen.java" --> "Login"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/Screen.java" --> "Splash"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/auth/AuthDebugActivity.java" --> "AuthDebugActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/chat/ChatScreenKt.java" --> "ChatScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/chat/ChatUiState.java" --> "ChatUiState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/chat/ChatViewModel.java" --> "ChatViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/home/HomeActivity.java" --> "HomeActivity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/home/HomeScreenKt.java" --> "HomeScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/home/HomeViewModel.java" --> "HomeViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginScreenKt.java" --> "LoginScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "LoginStates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "Authenticated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "Loading"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginStates.java" --> "LoggedOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/login/LoginViewModel.java" --> "LoginViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/navigation/AppNavGrapKt.java" --> "AppNavGrapKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/navigation/NavRoutes.java" --> "NavRoutes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/splash/SplashScreenKt.java" --> "SplashScreenKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/presentation/splash/SplashViewModel.java" --> "SplashViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/ui/theme/ColorKt.java" --> "ColorKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/ui/theme/ThemeKt.java" --> "ThemeKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/com/genius/tdlibandroid/ui/theme/TypeKt.java" --> "TypeKt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/build/tmp/kapt3/stubs/release/error/NonExistentClass.java" --> "NonExistentClass"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/androidTest/java/com/genius/tdlibandroid/ExampleInstrumentedTest.kt" --> "ExampleInstrumentedTest"
    "ExampleInstrumentedTest" --> "useAppContext"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/Alarm.kt" --> "Alarm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/AlarmAdapter.kt" --> "AlarmAdapter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/AlarmAdapter.kt" --> "AlarmViewHolder"
    "AlarmAdapter" --> "onItemClick"
    "AlarmAdapter" --> "onSwitchToggle"
    "AlarmAdapter" --> "onCreateViewHolder"
    "AlarmAdapter" --> "onBindViewHolder"
    "AlarmAdapter" --> "getItemCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/AlarmReceiver.kt" --> "AlarmReceiver"
    "AlarmReceiver" --> "onReceive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/AlarmService.kt" --> "AlarmService"
    "AlarmService" --> "onBind"
    "AlarmService" --> "onStartCommand"
    "AlarmService" --> "playAlarmSound"
    "AlarmService" --> "buildNotification"
    "AlarmService" --> "createChannelIfNeeded"
    "AlarmService" --> "onDestroy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/MainActivity.kt" --> "MainActivity"
    "MainActivity" --> "onCreate"
    "MainActivity" --> "checkAndRequestExactAlarmPermission"
    "MainActivity" --> "askForNotificationPermission"
    "MainActivity" --> "setupRecyclerView"
    "MainActivity" --> "showAlarmDialog"
    "MainActivity" --> "scheduleNormalAlarm"
    "MainActivity" --> "scheduleAlarm"
    "MainActivity" --> "cancelAlarm"
    "MainActivity" --> "onItemClick"
    "MainActivity" --> "onSwitchToggle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/MyApp.kt" --> "MyApp"
    "MyApp" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/core/TgBaseViewModel.kt" --> "TgBaseViewModel"
    "TgBaseViewModel" --> "getAuthStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/AuthState.kt" --> "AuthState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/AuthState.kt" --> "Error"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/TelegramClientImpl.kt" --> "TelegramClientImpl"
    "TelegramClientImpl" --> "handleAuthorizationState"
    "TelegramClientImpl" --> "setupTdlibParameters"
    "TelegramClientImpl" --> "send"
    "TelegramClientImpl" --> "setPhoneNumber"
    "TelegramClientImpl" --> "checkCode"
    "TelegramClientImpl" --> "checkPassword"
    "TelegramClientImpl" --> "logOut"
    "TelegramClientImpl" --> "getMe"
    "TelegramClientImpl" --> "getChats"
    "TelegramClientImpl" --> "getChat"
    "TelegramClientImpl" --> "openChat"
    "TelegramClientImpl" --> "closeChat"
    "TelegramClientImpl" --> "getChatHistory"
    "TelegramClientImpl" --> "getMessage"
    "TelegramClientImpl" --> "viewMessages"
    "TelegramClientImpl" --> "sendTyping"
    "TelegramClientImpl" --> "sendTextMessage"
    "TelegramClientImpl" --> "searchChats"
    "TelegramClientImpl" --> "editMessageText"
    "TelegramClientImpl" --> "deleteMessages"
    "TelegramClientImpl" --> "downloadFile"
    "TelegramClientImpl" --> "getFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/TgCore.kt" --> "TgCore"
    "TgCore" --> "initialize"
    "TgCore" --> "setPhone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/TgErrors.kt" --> "TgValidationError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/tgRepos/TgAuthRepository.kt" --> "TgAuthRepository"
    "TgAuthRepository" --> "setPhoneNumber"
    "TgAuthRepository" --> "checkCode"
    "TgAuthRepository" --> "checkPassword"
    "TgAuthRepository" --> "logOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/tgRepos/TgChatRepository.kt" --> "TgChatRepository"
    "TgChatRepository" --> "openChat"
    "TgChatRepository" --> "closeChat"
    "TgChatRepository" --> "getHistory"
    "TgChatRepository" --> "sendText"
    "TgChatRepository" --> "markRead"
    "TgChatRepository" --> "sendTyping"
    "TgChatRepository" --> "getMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/data/tgRepos/TgUserRepository.kt" --> "TgUserRepository"
    "TgUserRepository" --> "getMe"
    "TgUserRepository" --> "getChats"
    "TgUserRepository" --> "getChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/di/AppModule.kt" --> "AppModule"
    "AppModule" --> "bindTelegramClient"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/HiddenTelegramActivity.kt" --> "HiddenTelegramActivity"
    "HiddenTelegramActivity" --> "onCreate"
    "HiddenTelegramActivity" --> "App"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/Screen.kt" --> "Screen"
    "Screen" --> "buildRoute"
    "Screen" --> "getChatId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/auth/AuthDebugActivity.kt" --> "AuthDebugActivity"
    "AuthDebugActivity" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/chat/ChatViewModel.kt" --> "ChatUiState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/chat/ChatViewModel.kt" --> "ChatViewModel"
    "ChatUiState" --> "init"
    "ChatUiState" --> "startUpdates"
    "ChatUiState" --> "onInputChange"
    "ChatUiState" --> "sendMessage"
    "ChatUiState" --> "onCleared"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/home/HomeActivity.kt" --> "HomeActivity"
    "HomeActivity" --> "onCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/home/HomeViewModel.kt" --> "HomeViewModel"
    "HomeViewModel" --> "loadChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/login/LoginStates.kt" --> "LoginStates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/login/LoginStates.kt" --> "InsertNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/login/LoginStates.kt" --> "InsertCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/login/LoginStates.kt" --> "InsertPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/login/LoginViewModel.kt" --> "LoginViewModel"
    "LoginViewModel" --> "sendPhoneNumber"
    "LoginViewModel" --> "sendCode"
    "LoginViewModel" --> "sendPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/com/genius/tdlibandroid/presentation/splash/SplashViewModel.kt" --> "SplashViewModel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "for"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "Client"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "thrown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "ExecutionException"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "ResponseReceiver"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/Client.java" --> "Handler"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "contains"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TdApi"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "for"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Object"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "for"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Function"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AccountTtl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddedReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddedReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Address"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnimatedChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnimatedEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Animation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Animations"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ArchiveChatListSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AttachmentMenuBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AttachmentMenuBotColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Audio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeTelegramMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeSms"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeSmsWord"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeSmsPhrase"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeFlashCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeMissedCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeFragment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeFirebaseAndroid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthenticationCodeTypeFirebaseIos"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitTdlibParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitEmailCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitOtherDeviceConfirmation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateWaitPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateReady"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateLoggingOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateClosing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AuthorizationStateClosed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutoDownloadSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutoDownloadSettingsPresets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsException"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsScope"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsScopePrivateChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsScopeGroupChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsScopeChannelChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AutosaveSettingsScopeChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AvailableReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Background"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundFill"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundFillSolid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundFillGradient"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundFillFreeformGradient"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundTypeWallpaper"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundTypePattern"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundTypeFill"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BackgroundTypeChatTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Backgrounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BankCardActionOpenUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BankCardInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BasicGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BasicGroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Birthdate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BlockList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BlockListMain"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BlockListStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommand"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScope"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeDefault"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeAllPrivateChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeAllGroupChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeAllChatAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeChatAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommandScopeChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotCommands"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotMediaPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotMediaPreviewInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotMediaPreviews"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotMenuButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotTransactionPurpose"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotTransactionPurposePaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotTransactionPurposeInvoicePayment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotWriteAccessAllowReason"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotWriteAccessAllowReasonConnectedWebsite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotWriteAccessAllowReasonAddedToAttachmentMenu"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotWriteAccessAllowReasonLaunchedWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BotWriteAccessAllowReasonAcceptedRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessAwayMessageSchedule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessAwayMessageScheduleAlways"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessAwayMessageScheduleOutsideOfOpeningHours"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessAwayMessageScheduleCustom"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessAwayMessageSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessBotManageBar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessChatLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessChatLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessConnectedBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessConnection"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureOpeningHours"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureQuickReplies"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureGreetingMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureAwayMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureAccountLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureStartPage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureChatFolderTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatureUpgradedStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeaturePromotionAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessGreetingMessageSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessOpeningHours"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessOpeningHoursInterval"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessRecipients"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BusinessStartPage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Call"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReason"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReasonEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReasonMissed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReasonDeclined"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReasonDisconnected"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallDiscardReasonHungUp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblem"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemEcho"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemNoise"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemInterruptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemDistortedSpeech"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemSilentLocal"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemSilentRemote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemDropped"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemDistortedVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProblemPixelatedVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallProtocol"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallServer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallServerType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallServerTypeTelegramReflector"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallServerTypeWebrtc"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStatePending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStateExchangingKeys"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStateReady"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStateHangingUp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStateDiscarded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallStateError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallbackQueryAnswer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallbackQueryPayload"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallbackQueryPayloadData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallbackQueryPayloadDataWithPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CallbackQueryPayloadGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendMessageToUserResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendMessageToUserResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendMessageToUserResultUserIsDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendMessageToUserResultUserRestrictsNewChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultPremiumNeeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultBoostNeeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultActiveStoryLimitExceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultWeeklyLimitExceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStoryResultMonthlyLimitExceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnershipResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnershipResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnershipResultPasswordNeeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnershipResultPasswordTooFresh"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnershipResultSessionTooFresh"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChannelTransactionPurpose"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChannelTransactionPurposePaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChannelTransactionPurposeJoin"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChannelTransactionPurposeReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Chat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionTyping"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionRecordingVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionUploadingVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionRecordingVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionUploadingVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionUploadingPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionUploadingDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionChoosingSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionChoosingLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionChoosingContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionStartPlayingGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionRecordingVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionUploadingVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionWatchingAnimations"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionCancel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarReportSpam"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarReportUnrelatedLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarInviteMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarReportAddBlock"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarAddContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarSharePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActionBarJoinRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatActiveStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAdministrator"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAdministratorRights"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAvailableReactionsAll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatAvailableReactionsSome"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostLevelFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSlot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSlots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSourceGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSourceGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostSourcePremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatBoostStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEvent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMessageEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMessageDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMessagePinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMessageUnpinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventPollStopped"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberJoined"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberJoinedByInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberJoinedByRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberInvited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberLeft"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberPromoted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMemberRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventAvailableReactionsChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventBackgroundChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventDescriptionChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventEmojiStatusChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventLinkedChatChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventLocationChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventMessageAutoDeleteTimeChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventPermissionsChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventPhotoChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventSlowModeDelayChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventStickerSetChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventCustomEmojiStickerSetChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventTitleChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventUsernameChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventActiveUsernamesChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventAccentColorChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventProfileAccentColorChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventHasProtectedContentToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventInvitesToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventIsAllHistoryAvailableToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventHasAggressiveAntiSpamEnabledToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventSignMessagesToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventShowMessageSenderToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventInviteLinkEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventInviteLinkRevoked"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventInviteLinkDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventVideoChatCreated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventVideoChatEnded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventVideoChatMuteNewParticipantsToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventVideoChatParticipantIsMutedToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventVideoChatParticipantVolumeLevelChanged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventIsForumToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicCreated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicToggleIsClosed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicToggleIsHidden"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventForumTopicPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEventLogFilters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatEvents"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolderIcon"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolderInviteLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatFolderInviteLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkCounts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinkSubscriptionInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatInviteLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatJoinRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatJoinRequests"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatJoinRequestsInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatListMain"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatListArchive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatListFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatLists"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusCreator"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusAdministrator"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusLeft"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMemberStatusBanned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterMention"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterBanned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMembersFilterBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMessageSender"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatMessageSenders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatNearby"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPermissions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotoInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotoSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotoStickerType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotoStickerTypeRegularOrMask"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotoStickerTypeCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPhotos"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueAmount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransactionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransactionTypeEarnings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransactionTypeWithdrawal"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransactionTypeRefund"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatRevenueTransactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatSourceMtprotoProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatSourcePublicServiceAnnouncement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsChannel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsAdministratorActionsInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsInteractionInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsInviterInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsMessageSenderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsObjectType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsObjectTypeMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatStatisticsObjectTypeStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatTypePrivate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatTypeBasicGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatTypeSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatTypeSecret"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Chats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChatsNearby"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultUsernameInvalid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultUsernameOccupied"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultUsernamePurchasable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultPublicChatsTooMany"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsernameResultPublicGroupsUnavailable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckStickerSetNameResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckStickerSetNameResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckStickerSetNameResultNameInvalid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckStickerSetNameResultNameOccupied"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CloseBirthdayUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClosedVectorPath"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CollectibleItemInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CollectibleItemType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CollectibleItemTypeUsername"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CollectibleItemTypePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectedWebsite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectedWebsites"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionStateWaitingForNetwork"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionStateConnectingToProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionStateConnecting"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionStateUpdating"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConnectionStateReady"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Contact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Count"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Countries"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CountryInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreatedBasicGroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CurrentWeather"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CustomRequestResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DatabaseStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Date"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DateRange"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DatedFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeepLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceToken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenFirebaseCloudMessaging"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenApplePush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenApplePushVoIP"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenWindowsPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenMicrosoftPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenMicrosoftPushVoIP"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenWebPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenSimplePush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenUbuntuPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenBlackBerryPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenTizenPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeviceTokenHuaweiPush"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DiceStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DiceStickersRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DiceStickersSlotMachine"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Document"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DownloadedFileCounts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DraftMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressAuthentication"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressAuthenticationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressAuthenticationAppleId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressAuthenticationGoogleId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressAuthenticationCodeInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressResetState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressResetStateAvailable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmailAddressResetStatePending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategorySource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategorySourceSearch"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategorySourcePremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategoryType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategoryTypeDefault"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategoryTypeRegularStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategoryTypeEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiCategoryTypeChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiKeyword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiKeywords"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Emojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EncryptedCredentials"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EncryptedPassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Error"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FactCheck"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FailedToAddMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FailedToAddMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "File"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileDownload"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileDownloadedPrefixSize"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FilePart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeNone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeNotificationSound"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypePhotoStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeSecret"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeSecretThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeSecure"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeUnknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeVideoStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FileTypeWallpaper"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseAuthenticationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseAuthenticationSettingsAndroid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseAuthenticationSettingsIos"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseDeviceVerificationParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseDeviceVerificationParametersSafetyNet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FirebaseDeviceVerificationParametersPlayIntegrity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FormattedText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForumTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForumTopicIcon"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForumTopicInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForumTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForwardSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundChatBoosts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundChatMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundFileDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundPositions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FoundWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Game"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GameHighScore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GameHighScores"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallParticipant"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallParticipantVideoInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallRecentSpeaker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallStream"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallStreams"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallVideoQuality"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallVideoQualityThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallVideoQualityMedium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallVideoQualityFull"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GroupCallVideoSourceGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Hashtags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "HttpUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "IdentityDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ImportedContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeLoginUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeCallback"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeCallbackWithPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeCallbackGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeSwitchInline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeBuy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineKeyboardButtonTypeUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultArticle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResults"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultsButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultsButtonType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultsButtonTypeStartBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InlineQueryResultsButtonTypeWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBackgroundLocal"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBackgroundRemote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBackgroundPrevious"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBusinessChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputBusinessStartPage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputChatPhotoPrevious"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputChatPhotoStatic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputChatPhotoAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputChatPhotoSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputCredentials"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputCredentialsSaved"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputCredentialsNew"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputCredentialsApplePay"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputCredentialsGooglePay"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputFileId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputFileRemote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputFileLocal"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputFileGenerated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputIdentityDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultArticle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInlineQueryResultVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInvoiceMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInvoiceName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputInvoiceTelegram"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessagePaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessagePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageDice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessagePoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageForwarded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageReplyTo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageReplyToMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageReplyToExternalMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputMessageReplyToStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPaidMediaType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPaidMediaTypePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPaidMediaTypeVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementPersonalDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementPassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementDriverLicense"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementIdentityCard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementInternalPassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementUtilityBill"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementBankStatement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementRentalAgreement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementPassportRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementTemporaryRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceUnspecified"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceDataField"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceFrontSide"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceReverseSide"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceSelfie"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceTranslationFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceTranslationFiles"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPassportElementErrorSourceFiles"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputPersonalDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryArea"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeFoundVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypePreviousVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeSuggestedReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreaTypeWeather"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryAreas"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryContentPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputStoryContentVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputTextQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InputThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeActiveSessions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeAttachmentMenuBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeAuthenticationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBotAddToChannel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBotStart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBotStartInGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBusinessChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeBuyStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeChangePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeChatBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeChatFolderInvite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeChatFolderSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeChatInvite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeDefaultMessageAutoDeleteTimerSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeEditProfileSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeInstantView"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeLanguagePack"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeLanguageSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeMainWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeMessageDraft"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePassportDataRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePhoneNumberConfirmation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePremiumFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePremiumGift"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePrivacyAndSecuritySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypePublicChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeQrCodeAuthentication"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeRestorePurchases"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeThemeSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeUnknownDeepLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeUnsupportedProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeUserPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeUserToken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeVideoChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InternalLinkTypeWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InviteLinkChatType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InviteLinkChatTypeBasicGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InviteLinkChatTypeSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InviteLinkChatTypeChannel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Invoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonObjectMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueNull"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueBoolean"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueArray"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JsonValueObject"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeRequestPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeRequestLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeRequestPoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeRequestUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeRequestChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "KeyboardButtonTypeWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LabeledPricePart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackStringValue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackStringValueOrdinary"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackStringValuePluralized"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackStringValueDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LanguagePackStrings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewAlbumMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewAlbumMediaPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewAlbumMediaVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeAlbum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeArticle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeChannelBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeEmbeddedAnimationPlayer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeEmbeddedAudioPlayer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeEmbeddedVideoPlayer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypePremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeShareableChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeSupergroupBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeUnsupported"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeVideoChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LinkPreviewTypeWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LocalFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LocalizationTargetInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Location"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LocationAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogStream"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogStreamDefault"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogStreamFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogStreamEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogVerbosityLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoginUrlInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoginUrlInfoOpen"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoginUrlInfoRequestConfirmation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MainWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPoint"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPointForehead"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPointEyes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPointMouth"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPointChin"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MaskPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Message"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageCalendar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageCalendarDay"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageExpiredPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageExpiredVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageExpiredVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageExpiredVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageAnimatedEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageDice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVideoChatScheduled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVideoChatStarted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageVideoChatEnded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageInviteVideoChatParticipants"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageBasicGroupChatCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSupergroupChatCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatChangeTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatChangePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatDeletePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatAddMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatJoinByLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatJoinByRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatDeleteMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatUpgradeTo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatUpgradeFrom"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePinMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageScreenshotTaken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatSetBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatSetTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatSetMessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageForumTopicCreated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageForumTopicEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageForumTopicIsClosedToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageForumTopicIsHiddenToggled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSuggestProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageCustomServiceAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageGameScore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePaymentSuccessful"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePaymentSuccessfulBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePaymentRefunded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageGiftedPremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePremiumGiveawayCreated"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePremiumGiveawayCompleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePremiumGiveawayWinners"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageGiftedStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageContactRegistered"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageUsersShared"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageChatShared"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageBotWriteAccessAllowed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageWebAppDataSent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageWebAppDataReceived"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePassportDataSent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePassportDataReceived"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageProximityAlertTriggered"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageUnsupported"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageCopyOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageEffect"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageEffectType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageEffectTypeEmojiReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageEffectTypePremiumSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageFileType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageFileTypePrivate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageFileTypeGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageFileTypeUnknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageForwardInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageImportInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageInteractionInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageOrigin"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageOriginUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageOriginHiddenUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageOriginChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageOriginChannel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessagePositions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageProperties"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDateRead"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDateUnread"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDateTooOld"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDateUserPrivacyRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReadDateMyPrivacyRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReplyInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReplyTo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReplyToMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageReplyToStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSchedulingState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSchedulingStateSendAtDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSchedulingStateSendWhenOnline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSelfDestructType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSelfDestructTypeTimer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSelfDestructTypeImmediately"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSendOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSender"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSenderUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSenderChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSenders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSendingState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSendingStatePending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSendingStateFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceChatHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceMessageThreadHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceForumTopicHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceHistoryPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceChatList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceSearch"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceChatEventLog"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceScreenshot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSourceOther"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageSponsor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageThreadInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageViewer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "MessageViewers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Messages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Minithumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkStatisticsEntry"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkStatisticsEntryFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkStatisticsEntryCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkTypeNone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkTypeMobile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkTypeMobileRoaming"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkTypeWiFi"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NetworkTypeOther"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NewChatPrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Notification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroupType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroupTypeMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroupTypeMentions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroupTypeSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationGroupTypeCalls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSettingsScope"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSettingsScopePrivateChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSettingsScopeGroupChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSettingsScopeChannelChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSound"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationSounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationTypeNewMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationTypeNewSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationTypeNewCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "NotificationTypeNewPushMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Ok"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptionValue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptionValueBoolean"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptionValueEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptionValueInteger"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptionValueString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OrderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlock"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockSubtitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockAuthorDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockHeader"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockSubheader"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockKicker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockParagraph"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockPreformatted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockFooter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockDivider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockAnchor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockBlockQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockPullQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockCover"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockEmbedded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockEmbeddedPost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockCollage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockSlideshow"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockTable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockRelatedArticles"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockMap"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockCaption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockHorizontalAlignment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockHorizontalAlignmentLeft"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockHorizontalAlignmentCenter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockHorizontalAlignmentRight"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockListItem"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockRelatedArticle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockTableCell"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVerticalAlignment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVerticalAlignmentTop"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVerticalAlignmentMiddle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PageBlockVerticalAlignmentBottom"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidMediaPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidMediaPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidMediaVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidMediaUnsupported"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaidReactor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportAuthorizationForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementPersonalDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementPassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementDriverLicense"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementIdentityCard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementInternalPassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementUtilityBill"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementBankStatement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementRentalAgreement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementPassportRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTemporaryRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceUnspecified"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceDataField"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceFrontSide"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceReverseSide"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceSelfie"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceTranslationFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceTranslationFiles"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementErrorSourceFiles"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypePersonalDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypePassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeDriverLicense"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeIdentityCard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeInternalPassport"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeUtilityBill"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeBankStatement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeRentalAgreement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypePassportRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeTemporaryRegistration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementTypeEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElements"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportElementsWithErrors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportRequiredElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PassportSuitableElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PasswordState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentFormType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentFormTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentFormTypeStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentProvider"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentProviderSmartGlocal"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentProviderStripe"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentProviderOther"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentReceipt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentReceiptType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentReceiptTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentReceiptTypeStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PaymentResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PersonalDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PersonalDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberAuthenticationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberCodeType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberCodeTypeChange"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberCodeTypeVerify"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberCodeTypeConfirmOwnership"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhoneNumberInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Photo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PhotoSize"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Point"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Poll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PollOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PollType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PollTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PollTypeQuiz"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureIncreasedLimits"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureIncreasedUploadFileSize"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureImprovedDownloadSpeed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureVoiceRecognition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureDisabledAds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureUniqueReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureUniqueStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureAdvancedChatManagement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureProfileBadge"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureAnimatedProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureForumTopicIcon"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureAppIcons"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureRealTimeChatTranslation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureUpgradedStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureChatBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureBackgroundForBoth"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureSavedMessagesTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureMessagePrivacy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureLastSeenTimes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureBusiness"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatureMessageEffects"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeaturePromotionAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiftCodeInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiftCodePaymentOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiftCodePaymentOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayInfoOngoing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayInfoCompleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatusEligible"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatusParticipating"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatusAlreadyWasMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatusAdministrator"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumGiveawayParticipantStatusDisallowedCountry"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimit"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeSupergroupCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypePinnedChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeCreatedPublicChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeSavedAnimationCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeFavoriteStickerCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeChatFolderCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeChatFolderChosenChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypePinnedArchivedChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypePinnedSavedMessagesTopicCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeCaptionLength"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeBioLength"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeChatFolderInviteLinkCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeShareableChatFolderCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeActiveStoryCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeWeeklySentStoryCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeMonthlySentStoryCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeStoryCaptionLength"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeStorySuggestedReactionAreaCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumLimitTypeSimilarChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumPaymentOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceLimitExceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceBusinessFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceStoryFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumSourceSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStatePaymentOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeaturePriorityOrder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeatureStealthMode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeaturePermanentViewsHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeatureCustomExpirationDuration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeatureSaveStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeatureLinksAndFormatting"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PremiumStoryFeatureVideoQuality"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PrepaidPremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProductInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProfileAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProfileAccentColors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Proxies"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Proxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProxyType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProxyTypeSocks5"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProxyTypeHttp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProxyTypeMtproto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicChatType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicChatTypeHasUsername"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicChatTypeIsLocationBased"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicForward"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicForwardMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicForwardStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PublicForwards"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentHidden"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentContactRegistered"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentGame"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentGameScore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentInvoice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentPaidMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentPoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentPremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentPremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentScreenshotTaken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentBasicGroupChatCreate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatAddMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatChangePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatChangeTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatSetBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatSetTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatDeleteMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatJoinByLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentChatJoinByRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentRecurringPayment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentSuggestProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentMessageForwards"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushMessageContentMediaAlbum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PushReceiverId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "QuickReplyMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "QuickReplyMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "QuickReplyShortcut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionNotificationSource"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionNotificationSourceNone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionNotificationSourceContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionNotificationSourceAll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionTypeEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionTypeCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionTypePaid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionUnavailabilityReason"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionUnavailabilityReasonAnonymousAdministrator"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReactionUnavailabilityReasonGuest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadDatePrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecommendedChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecommendedChatFolders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecoveryEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoteFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplyMarkupRemoveKeyboard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplyMarkupForceReply"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplyMarkupShowKeyboard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplyMarkupInlineKeyboard"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResultFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResultOptionRequired"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResultAdsHidden"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessageResultPremiumRequired"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReason"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonSpam"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonViolence"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonPornography"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonChildAbuse"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonCopyright"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonUnrelatedLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonFake"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonIllegalDrugs"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonPersonalDetails"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportReasonCustom"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendCodeReason"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendCodeReasonUserRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendCodeReasonVerificationFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetPasswordResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetPasswordResultOk"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetPasswordResultPending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetPasswordResultDeclined"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevenueWithdrawalState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevenueWithdrawalStatePending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevenueWithdrawalStateSucceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevenueWithdrawalStateFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextPlain"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextBold"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextItalic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextUnderline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextStrikethrough"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextFixed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextSubscript"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextSuperscript"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextMarked"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextIcon"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextReference"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextAnchor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTextAnchorLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RichTexts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RtmpUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedCredentials"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTopicType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTopicTypeMyNotes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTopicTypeAuthorHidden"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SavedMessagesTopicTypeSavedFromChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ScopeAutosaveSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ScopeNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterAudio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterDocument"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterVoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterPhotoAndVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterVoiceAndVideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterMention"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterUnreadMention"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterUnreadReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterFailedToSend"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessagesFilterPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Seconds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SecretChatState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SecretChatStatePending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SecretChatStateReady"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SecretChatStateClosed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SentWebAppMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Session"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeAndroid"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeApple"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeBrave"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeChrome"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeEdge"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeFirefox"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeIpad"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeIphone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeLinux"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeMac"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeOpera"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeSafari"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeUbuntu"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeUnknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeVivaldi"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeWindows"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SessionTypeXbox"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Sessions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SharedChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SharedUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ShippingOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SpeechRecognitionResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SpeechRecognitionResultPending"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SpeechRecognitionResultText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SpeechRecognitionResultError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SponsoredMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SponsoredMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarPaymentOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarPaymentOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarRevenueStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarRevenueStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarSubscription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarSubscriptionPricing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarSubscriptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionDirection"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionDirectionIncoming"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionDirectionOutgoing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartner"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerTelegram"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerAppStore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerGooglePlay"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerFragment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerTelegramAds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerBusiness"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerChannel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactionPartnerUnsupported"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StarTransactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StatisticalGraph"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StatisticalGraphData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StatisticalGraphAsync"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StatisticalGraphError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StatisticalValue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Sticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFormat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFormatWebp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFormatTgs"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFormatWebm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFullType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFullTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFullTypeMask"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerFullTypeCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerSetInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerTypeMask"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StickerTypeCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Stickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorageStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorageStatisticsByChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorageStatisticsByFileType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorageStatisticsFast"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurpose"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposePremiumSubscription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposeGiftedPremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposePremiumGiftCodes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposePremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposeStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StorePaymentPurposeGiftedStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Stories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Story"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryArea"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeSuggestedReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryAreaTypeWeather"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryContentPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryContentVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryContentUnsupported"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryFullId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteraction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractionInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractionTypeView"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractionTypeForward"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractionTypeRepost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryInteractions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryListMain"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryListArchive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryOrigin"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryOriginPublicStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryOriginHiddenUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryPrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryPrivacySettingsEveryone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryPrivacySettingsContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryPrivacySettingsCloseFriends"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryPrivacySettingsSelectedUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryRepostInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StoryVideo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionEnableArchiveAndMuteNewChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionCheckPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionCheckPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionViewChecksHint"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionConvertToBroadcastGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionSetPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionUpgradePremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionRestorePremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionSubscribeToAnnualPremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionGiftPremiumForChristmas"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionSetBirthdate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionExtendPremium"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestedActionExtendStarSubscriptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Supergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilter"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterRecent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterSearch"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterRestricted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterBanned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterMention"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SupergroupMembersFilterBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrlType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrlTypeUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrlTypeSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrlTypeChatInvite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrlTypeStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TMeUrls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TargetChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TargetChatCurrent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TargetChatChosen"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TargetChatInternalLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurpose"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurposePremiumGiftCodes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurposePremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurposeStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurposeGiftedStars"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TelegramPaymentPurposeJoinChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TemporaryPasswordState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TermsOfService"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestBytes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestInt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestVectorInt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestVectorIntObject"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestVectorString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestVectorStringObject"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Text"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntities"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntity"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeMention"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeHashtag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeCashtag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeBotCommand"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeBankCardNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeBold"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeItalic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeUnderline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeStrikethrough"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeSpoiler"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypePre"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypePreCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeBlockQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeExpandableBlockQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeTextUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeMentionName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeCustomEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextEntityTypeMediaTimestamp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextParseMode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextParseModeMarkdown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextParseModeHTML"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TextQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThemeParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThemeSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Thumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatJpeg"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatGif"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatMpeg4"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatPng"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatTgs"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatWebm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ThumbnailFormatWebp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TimeZone"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TimeZones"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryGroups"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryChannels"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryInlineBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryWebAppBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryCalls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TopChatCategoryForwardChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TrendingStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UnconfirmedSession"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UnreadReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Update"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAuthorizationState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageSendAcknowledged"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageSendSucceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageSendFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageIsPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageInteractionInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageContentOpened"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageMentionRead"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageUnreadReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageFactCheck"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageLiveLocationViewed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatAccentColors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatPermissions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatLastMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatAddedToList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatRemovedFromList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatReadInbox"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatReadOutbox"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatActionBar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatBusinessBotManageBar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatAvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatDraftMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatMessageSender"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatMessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatPendingJoinRequests"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatUnreadMentionCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatUnreadReactionCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatVideoChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatDefaultDisableNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatHasProtectedContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatIsTranslatable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatIsMarkedAsUnread"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatViewAsTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatBlockList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatHasScheduledMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatFolders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatOnlineMemberCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSavedMessagesTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSavedMessagesTopicCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateQuickReplyShortcut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateQuickReplyShortcutDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateQuickReplyShortcuts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateQuickReplyShortcutMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateForumTopicInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateScopeNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateReactionNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNotificationGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateActiveNotifications"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateHavePendingNotifications"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateDeleteMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUserStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateBasicGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUserFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateBasicGroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSupergroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateServiceNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileGenerationStart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileGenerationStop"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileAddedToDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileDownload"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFileRemovedFromDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateApplicationVerificationRequired"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateGroupCallParticipant"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewCallSignalingData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUserPrivacySettingRules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUnreadMessageCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUnreadChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStoryDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStorySendSucceeded"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStorySendFailed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatActiveStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStoryListChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStoryStealthMode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateInstalledStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateTrendingStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateRecentStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateFavoriteStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSavedAnimations"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSavedNotificationSounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateDefaultBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatThemes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAccentColors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateProfileAccentColors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateLanguagePackStrings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateConnectionState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateTermsOfService"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUsersNearby"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateUnconfirmedSession"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAttachmentMenuBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateWebAppMessageSent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateActiveEmojiReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAvailableMessageEffects"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateDefaultReactionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSavedMessagesTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateActiveLiveLocationMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateOwnedStarCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatRevenueAmount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateStarRevenueStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSpeechRecognitionTrial"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateDiceEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAnimatedEmojiMessageClicked"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAnimationSearchParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSuggestedActions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateSpeedLimitNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateContactCloseBirthdays"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateAutosaveSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateBusinessConnection"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewBusinessMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateBusinessMessageEdited"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateBusinessMessagesDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewInlineQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewChosenInlineResult"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewCallbackQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewInlineCallbackQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewBusinessCallbackQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewShippingQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewPreCheckoutQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewCustomEvent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewCustomQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdatePoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdatePollAnswer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateNewChatJoinRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateChatBoost"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpdateMessageReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Updates"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "User"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySetting"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowLinkInForwardedMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowBio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingShowBirthdate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingAllowChatInvites"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingAllowCalls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingAllowPeerToPeerCalls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingAllowFindingByPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRule"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleAllowAll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleAllowContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleAllowPremiumUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleAllowUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleAllowChatMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleRestrictAll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleRestrictContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleRestrictUsers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRuleRestrictChatMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserPrivacySettingRules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusOnline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusOffline"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusRecently"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusLastWeek"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserStatusLastMonth"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserSupportInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserTypeRegular"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserTypeDeleted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserTypeBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UserTypeUnknown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Usernames"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Users"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ValidatedOrderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "is"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VectorPathCommand"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "constructor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VectorPathCommandLine"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VectorPathCommandCubicBezierCurve"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Venue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Video"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VideoChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VideoNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "VoiceNote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "WebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "WebAppInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "WebPageInstantView"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AcceptCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AcceptTermsOfService"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ActivateStoryStealthMode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddBotMediaPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddChatFolderByInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddChatMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddChatToList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddContact"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddCustomServerLanguagePack"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddFavoriteSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddFileToDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddLocalMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddLogMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddMessageReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddNetworkStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddPaidMessageReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddQuickReplyShortcutInlineQueryResultMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddQuickReplyShortcutMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddQuickReplyShortcutMessageAlbum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddRecentSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddRecentlyFoundChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddSavedAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddSavedNotificationSound"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AddStickerToSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AllowBotToSendMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerCallbackQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerCustomQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerInlineQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerPreCheckoutQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerShippingQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AnswerWebAppQuery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ApplyPremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AssignAppStoreTransaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "AssignGooglePlayTransaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BanChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BlockMessageSenderFromReplies"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "BoostChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanBotSendMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanPurchaseFromStore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendMessageToUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanSendStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CanTransferOwnership"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CancelDownloadFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CancelPasswordReset"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CancelPreliminaryUploadFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CancelRecoveryEmailAddressVerification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChangeImportedContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ChangeStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckAuthenticationBotToken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckAuthenticationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckAuthenticationEmailCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckAuthenticationPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckAuthenticationPasswordRecoveryCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckChatUsername"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckCreatedPublicChatsLimit"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckEmailAddressVerificationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckLoginEmailAddressCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckPasswordRecoveryCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckPhoneNumberCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckPremiumGiftCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckQuickReplyShortcutName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckRecoveryEmailAddressCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CheckStickerSetName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CleanFileName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearAllDraftMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearAutosaveSettingsExceptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearImportedContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearRecentEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearRecentReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearRecentStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearRecentlyFoundChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClearSearchedForTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClickAnimatedEmojiMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClickChatSponsoredMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ClickPremiumSubscriptionButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Close"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CloseChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CloseSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CloseStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CloseWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConfirmQrCodeAuthentication"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ConfirmSession"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateBasicGroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateBusinessChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateChatSubscriptionInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateForumTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateInvoiceLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateNewBasicGroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateNewSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateNewStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateNewSupergroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreatePrivateChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateSupergroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateTemporaryPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "CreateVideoChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteAccount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteAllCallMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteAllRevokedChatInviteLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteBotMediaPreviews"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteBusinessChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteBusinessConnectedBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatMessagesByDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatMessagesBySender"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteChatReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteCommands"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteDefaultBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteForumTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteLanguagePack"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeletePassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteQuickReplyShortcut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteQuickReplyShortcutMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteRevokedChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteSavedCredentials"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteSavedMessagesTopicHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteSavedMessagesTopicMessagesByDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteSavedOrderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DeleteStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "Destroy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DisableAllSupergroupUsernames"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DisableProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DiscardCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DisconnectAllWebsites"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DisconnectWebsite"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "DownloadFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBotMediaPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessChatLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessMessageCaption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessMessageLiveLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessMessageMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessMessageReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditBusinessMessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditChatSubscriptionInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditCustomLanguagePackInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditForumTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditInlineMessageCaption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditInlineMessageLiveLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditInlineMessageMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditInlineMessageReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditInlineMessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageCaption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageLiveLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageMedia"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageReplyMarkup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageSchedulingState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditMessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditQuickReplyMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditStarSubscription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EditStoryCover"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EnableProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EndGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EndGroupCallRecording"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "EndGroupCallScreenSharing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "FinishFileGeneration"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ForwardMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAccountTtl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetActiveSessions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAllPassportElements"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAllStickerEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAnimatedEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetApplicationConfig"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetApplicationDownloadLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetArchiveChatListSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetArchivedStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAttachedStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAttachmentMenuBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAuthorizationState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAutoDownloadSettingsPresets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAutosaveSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetAvailableChatBoostSlots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBackgroundUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBankCardInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBasicGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBasicGroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBlockedMessageSenders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBotInfoDescription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBotInfoShortDescription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBotMediaPreviewInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBotMediaPreviews"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBotName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBusinessChatLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBusinessChatLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBusinessConnectedBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBusinessConnection"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetBusinessFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCallbackQueryAnswer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCallbackQueryMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatActiveStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatAdministrators"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatArchivedStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatAvailableMessageSenders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoostFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoostLevelFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoostLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoostLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoostStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatBoosts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatEventLog"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolder"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolderChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolderChatsToLeave"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolderDefaultIconName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolderInviteLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatFolderNewChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatInviteLinkCounts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatInviteLinkMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatInviteLinks"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatJoinRequests"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatListsToAddChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatMember"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatMessageByDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatMessageCalendar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatMessageCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatMessagePosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatNotificationSettingsExceptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatPinnedMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatPostedToChatPageStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatRevenueStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatRevenueTransactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatRevenueWithdrawalUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatScheduledMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatSimilarChatCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatSimilarChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatSparseMessagePositions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatSponsoredMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatStoryInteractions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatsForChatFolderInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetChatsToSendStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCloseFriends"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCollectibleItemInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCommands"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetConnectedWebsites"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCountries"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCountryCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCountryFlagEmoji"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCreatedPublicChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCurrentState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCurrentWeather"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCustomEmojiReactionAnimations"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetCustomEmojiStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDatabaseStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDeepLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultBackgroundCustomEmojiStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultChatEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultChatPhotoCustomEmojiStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultMessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDefaultProfilePhotoCustomEmojiStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetDisallowedChatEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetEmojiCategories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetEmojiReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetEmojiSuggestionsUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetExternalLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetExternalLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetFavoriteStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetFileDownloadedPrefixSize"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetFileExtension"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetFileMimeType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetForumTopic"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetForumTopicDefaultIcons"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetForumTopicLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetForumTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGameHighScores"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGreetingStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGroupCallInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGroupCallStreamSegment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGroupCallStreams"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetGroupsInCommon"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetImportedContactCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInactiveSupergroupChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInlineGameHighScores"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInlineQueryResults"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInstalledBackgrounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInstalledStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInternalLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetInternalLinkType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetJsonString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetJsonValue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetKeywordEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLanguagePackInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLanguagePackString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLanguagePackStrings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLinkPreview"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLocalizationTargetInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLogStream"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLogTagVerbosityLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLogTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLogVerbosityLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLoginUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetLoginUrlInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMainWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMapThumbnailFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMarkdownText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMe"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMenuButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageAddedReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageAvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageEffect"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageEmbeddingCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageFileType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageImportConfirmationText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageLinkInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageLocally"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageProperties"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessagePublicForwards"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageReadDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageThread"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageThreadHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessageViewers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetNetworkStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetNewChatPrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetOwnedStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPassportAuthorizationForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPassportAuthorizationFormAvailableElements"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPasswordState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPaymentForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPaymentReceipt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPhoneNumberInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPhoneNumberInfoSync"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPollVoters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPopularWebAppBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPreferredCountryLanguage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumFeatures"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumGiftCodePaymentOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumGiveawayInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumLimit"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumStickerExamples"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPremiumStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetProxies"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetProxyLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetPushReceiverId"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetReadDatePrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecentEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecentInlineBots"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecentStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecentlyOpenedChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecentlyVisitedTMeUrls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecommendedChatFolders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecommendedChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRecoveryEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRemoteFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetRepliedMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedAnimations"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedMessagesTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedMessagesTopicHistory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedMessagesTopicMessageByDate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedNotificationSound"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedNotificationSounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSavedOrderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetScopeNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSearchedForTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSecretChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarAdAccountUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarGiftPaymentOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarPaymentOptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarRevenueStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarSubscriptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarTransactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStarWithdrawalUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStatisticalGraph"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStickerEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStorageStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStorageStatisticsFast"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStoryAvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStoryInteractions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStoryNotificationSettingsExceptions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStoryPublicForwards"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetStoryStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSuggestedFileName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSuggestedStickerSetName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSuitableDiscussionChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSuitablePersonalChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSupergroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSupergroupFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSupergroupMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSupportName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetSupportUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetTemporaryPasswordState"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetTextEntities"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetThemeParametersJsonString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetThemedChatEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetThemedEmojiStatuses"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetTimeZones"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetTopChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetTrendingStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserChatBoosts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserFullInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserPrivacySettingRules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserProfilePhotos"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetUserSupportInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetVideoChatAvailableParticipants"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetVideoChatRtmpUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetWebAppLinkUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetWebAppUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "GetWebPageInstantView"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "HideContactCloseBirthdays"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "HideSuggestedAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ImportContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ImportMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "InviteGroupCallParticipants"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JoinChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JoinChatByInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "JoinGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LaunchPrepaidPremiumGiveaway"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LeaveChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LeaveGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadActiveStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadGroupCallParticipants"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadQuickReplyShortcutMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadQuickReplyShortcuts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LoadSavedMessagesTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "LogOut"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OpenChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OpenChatSimilarChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OpenMessageContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OpenStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OpenWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "OptimizeStorage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ParseMarkdown"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ParseTextEntities"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PinChatMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PingProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "PreliminaryUploadFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProcessChatFolderNewChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProcessChatJoinRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProcessChatJoinRequests"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ProcessPushNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RateSpeechRecognition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadAllChatMentions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadAllChatReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadAllMessageThreadMentions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadAllMessageThreadReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadChatList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReadFilePart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReaddQuickReplyShortcutMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecognizeSpeech"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecoverAuthenticationPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RecoverPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RefundStarPayment"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RegisterDevice"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RegisterUser"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveAllFilesFromDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveBusinessConnectedBotFromChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveChatActionBar"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveFavoriteSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveFileFromDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveInstalledBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveMessageReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveNotificationGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemovePendingPaidMessageReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveRecentHashtag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveRecentSticker"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveRecentlyFoundChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveSavedAnimation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveSavedNotificationSound"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveSearchedForTag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveStickerFromSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RemoveTopChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderActiveUsernames"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderBotActiveUsernames"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderBotMediaPreviews"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderChatFolders"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderInstalledStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderQuickReplyShortcuts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReorderSupergroupActiveUsernames"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplacePrimaryChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplaceStickerInSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReplaceVideoChatRtmpUrl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportAuthenticationCodeMissing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportChatSponsoredMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportMessageReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportPhoneNumberCodeMissing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportSupergroupAntiSpamFalsePositive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReportSupergroupSpam"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RequestAuthenticationPasswordRecovery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RequestPasswordRecovery"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RequestQrCodeAuthentication"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendAuthenticationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendEmailAddressVerificationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendLoginEmailAddressCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendPhoneNumberCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResendRecoveryEmailAddressCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetAllNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetAuthenticationEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetInstalledBackgrounds"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetNetworkStatistics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ResetPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ReuseStarSubscription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevokeChatInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "RevokeGroupCallInviteLink"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SaveApplicationLogEvent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchCallMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChatMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChatMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChatRecentLocationMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChatsNearby"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchChatsOnServer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchContacts"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchFileDownloads"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchHashtags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchInstalledStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchOutgoingDocumentMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicMessagesByTag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicStoriesByLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicStoriesByTag"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchPublicStoriesByVenue"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchQuote"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchRecentlyFoundChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchSavedMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchSecretMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchStickers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchStringsByPrefix"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchUserByPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchUserByToken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SearchWebApp"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendAuthenticationFirebaseSms"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendBotStartMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendBusinessMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendBusinessMessageAlbum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendCallDebugInformation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendCallLog"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendCallRating"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendCallSignalingData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendChatAction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendCustomRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendEmailAddressVerificationCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendInlineQueryResultMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendMessageAlbum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendPassportAuthorizationForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendPaymentForm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendPhoneNumberCode"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendPhoneNumberFirebaseSms"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendQuickReplyShortcutMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendStory"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendWebAppCustomRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SendWebAppData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAccountTtl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAlarm"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetApplicationVerificationToken"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetArchiveChatListSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAuthenticationEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAuthenticationPhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAutoDownloadSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetAutosaveSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBio"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBirthdate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBotInfoDescription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBotInfoShortDescription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBotName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBotProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBotUpdatesStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessAwayMessageSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessConnectedBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessGreetingMessageSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessMessageIsPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessOpeningHours"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetBusinessStartPage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatActiveStoriesList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatAvailableReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatClientData"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatDescription"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatDiscussionGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatDraftMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatMemberStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatMessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatMessageSender"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatPermissions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatPhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatPinnedStories"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatProfileAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatSlowModeDelay"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatTheme"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetChatTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetCloseFriends"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetCommands"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetCustomEmojiStickerSetThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetCustomLanguagePack"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetCustomLanguagePackString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDatabaseEncryptionKey"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDefaultBackground"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDefaultChannelAdministratorRights"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDefaultGroupAdministratorRights"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDefaultMessageAutoDeleteTime"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetDefaultReactionType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetEmojiStatus"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetFileGenerationProgress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetForumTopicNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetGameScore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetGroupCallParticipantIsSpeaking"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetGroupCallParticipantVolumeLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetGroupCallTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetInactiveSessionTtl"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetInlineGameScore"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetLocation"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetLogStream"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetLogTagVerbosityLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetLogVerbosityLevel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetLoginEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetMenuButton"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetMessageFactCheck"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetMessageReactions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetMessageSenderBlockList"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetNetworkType"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetNewChatPrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetOption"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPassportElement"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPassportElementErrors"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPassword"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPersonalChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPinnedChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPinnedForumTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPinnedSavedMessagesTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetPollAnswer"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetProfileAccentColor"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetQuickReplyShortcutName"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetReactionNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetReadDatePrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetRecoveryEmailAddress"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetSavedMessagesTagLabel"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetScopeNotificationSettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerEmojis"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerKeywords"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerMaskPosition"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerPositionInSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerSetThumbnail"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStickerSetTitle"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStoryPrivacySettings"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetStoryReaction"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetSupergroupCustomEmojiStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetSupergroupStickerSet"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetSupergroupUnrestrictBoostCount"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetSupergroupUsername"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetTdlibParameters"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetUserPersonalProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetUserPrivacySettingRules"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetUserSupportInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetUsername"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SetVideoChatDefaultParticipant"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ShareChatWithBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SharePhoneNumber"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ShareUsersWithBot"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StartGroupCallRecording"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StartGroupCallScreenSharing"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StartScheduledGroupCall"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StopBusinessPoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "StopPoll"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SuggestUserProfilePhoto"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "SynchronizeLanguagePack"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TerminateAllOtherSessions"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TerminateSession"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallBytes"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallEmpty"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallVectorInt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallVectorIntObject"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallVectorString"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestCallVectorStringObject"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestGetDifference"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestNetwork"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestProxy"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestReturnError"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestSquareInt"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TestUseUpdate"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleAllDownloadsArePaused"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleBotIsAddedToAttachmentMenu"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleBotUsernameIsActive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleBusinessConnectedBotChatIsPaused"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatDefaultDisableNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatFolderTags"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatHasProtectedContent"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatIsMarkedAsUnread"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatIsPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatIsTranslatable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleChatViewAsTopics"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleDownloadIsPaused"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleForumTopicIsClosed"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleForumTopicIsPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGeneralForumTopicIsHidden"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallEnabledStartNotification"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallIsMyVideoEnabled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallIsMyVideoPaused"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallMuteNewParticipants"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallParticipantIsHandRaised"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallParticipantIsMuted"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleGroupCallScreenSharingIsPaused"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleHasSponsoredMessagesEnabled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TogglePaidMessageReactionIsAnonymous"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSavedMessagesTopicIsPinned"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSessionCanAcceptCalls"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSessionCanAcceptSecretChats"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleStoryIsPostedToChatPage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupCanHaveSponsoredMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupHasAggressiveAntiSpamEnabled"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupHasHiddenMembers"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupIsAllHistoryAvailable"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupIsBroadcastGroup"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupIsForum"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupJoinByRequest"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupJoinToSendMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupSignMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleSupergroupUsernameIsActive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ToggleUsernameIsActive"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TransferChatOwnership"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TranslateMessageText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "TranslateText"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UnpinAllChatMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UnpinAllMessageThreadMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UnpinChatMessage"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UpgradeBasicGroupChatToSupergroupChat"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "UploadStickerFile"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ValidateOrderInfo"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ViewMessages"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ViewPremiumFeature"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "ViewTrendingStickerSets"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/main/java/org/drinkless/tdlib/TdApi.java" --> "WriteGeneratedFilePart"
    "C:/Users/mansu/Desktop/app/TDLibAndroidImplementation-main/TDLibAndroidImplementation-main/app/src/test/java/com/genius/tdlibandroid/ExampleUnitTest.kt" --> "ExampleUnitTest"
    "ExampleUnitTest" --> "addition_isCorrect"
```
