package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("FACTMANGA", "Fact Manga", "en")
internal class FactManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FACTMANGA, "factmanga.com")
