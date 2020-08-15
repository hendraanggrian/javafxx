@file:JvmMultifileClass
@file:JvmName("FxCoroutinesKt")

package ktfx.coroutines

import javafx.concurrent.Service
import javafx.concurrent.WorkerStateEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import kotlin.Unit
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * @see Service.setOnReady
 */
fun Service<*>.onReady(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnReady { event -> GlobalScope.launch(context) { action(event) } }
}

/**
 * @see Service.setOnScheduled
 */
fun Service<*>.onScheduled(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnScheduled { event -> GlobalScope.launch(context) { action(event) } }
}

/**
 * @see Service.setOnRunning
 */
fun Service<*>.onRunning(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnRunning { event -> GlobalScope.launch(context) { action(event) } }
}

/**
 * @see Service.setOnSucceeded
 */
fun Service<*>.onSucceeded(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnSucceeded { event -> GlobalScope.launch(context) { action(event) } }
}

/**
 * @see Service.setOnCancelled
 */
fun Service<*>.onCancelled(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnCancelled { event -> GlobalScope.launch(context) { action(event) } }
}

/**
 * @see Service.setOnFailed
 */
fun Service<*>.onFailed(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(WorkerStateEvent) -> Unit
) {
    return setOnFailed { event -> GlobalScope.launch(context) { action(event) } }
}
