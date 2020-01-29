@file:Suppress("NOTHING_TO_INLINE")

package ktfx

import javafx.application.Application
import javafx.application.HostServices

/** Launch a JavaFX application with reified type. */
inline fun <reified T : Application> launchApplication(vararg args: String): Unit =
    Application.launch(T::class.java, *args)

/**
 * Resolves the specified relative URI against the code base URI and returns the resolved URI.
 *
 * @see HostServices.getCodeBase
 * @see HostServices.resolveURI
 */
inline fun HostServices.resolveCodeURI(rel: String): String = resolveURI(codeBase, rel)

/**
 * Resolves the specified relative URI against the document base URI and returns the resolved URI.
 *
 * @see HostServices.getDocumentBase
 * @see HostServices.resolveURI
 */
inline fun HostServices.resolveDocumentURI(rel: String): String = resolveURI(documentBase, rel)
