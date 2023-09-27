package org.koitharu.kotatsu.parsers.site.madara.pt

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("DIANXIATRADS", "Dianxia Trads", "pt")
internal class DianxiaTrads(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.DIANXIATRADS, "dianxiatrads.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
