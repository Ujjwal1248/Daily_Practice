import { lazy, Suspense } from "react"

const FeatureCard = lazy(() => import("../components/FeatureCard"))

export default function Home() {
  return (
    <section>
      <h2>Welcome to EduSite</h2>
      <p>A Vite + React demo for lazy loading concepts.</p>

      <Suspense fallback={<p>Loading features...</p>}>
        <FeatureCard
          title="Fast Performance"
          desc="Components load only when needed."
        />
        <FeatureCard
          title="Clean Architecture"
          desc="Separated pages and reusable components."
        />
      </Suspense>
    </section>
  )
}
