package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ASURASCANS_US", "Asura Scans .Us", "en")
internal class AsuraScansUs(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ASURASCANS_US, "asurascans.us")
